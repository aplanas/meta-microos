SUMMARY = "Docserv auxiliary service endpoints"
DESCRIPTION = "docserv-auxserver has a very efficient, small map to redirect to the correct manual page for rpm2docserv created html repositories."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-auxserver-20230308.4ed55cf-1.5.aarch64.rpm"
RPM_HASH = "98164d669f04691e221fc71e097582df5eb63c7dc65d23d283e47a08dcb3c3c32eb8027a66023d2f6e442c5a090abc835ae26e7f7208929b6a5a8068b42fe2e0"

RPROVIDES:${PN} += "docserv-auxserver \
group-docserv-aux \
user-docserv-aux"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
