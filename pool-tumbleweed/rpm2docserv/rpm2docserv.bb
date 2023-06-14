SUMMARY = "Make manpages from RPMs accessible in a web browser"
DESCRIPTION = "rpm2docserv extracts manual pages from RPM packages and makes them accessible in a web browser."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "rpm2docserv-20230308.4ed55cf-1.4.aarch64.rpm"
RPM_HASH = "d808c43858b77277b99b300bed399815dd9138a192be3be03b1b97e0db757bbc0d4e75a6b1afe40ffe6c0af0316fcc76d691d6def0f2b4e82d821a514ce91e1a"

RPROVIDES:${PN} += "rpm2docserv"

RDEPENDS:${PN} += "/usr/bin/mandoc \
cpio \
libc.so.6"

inherit rpm
