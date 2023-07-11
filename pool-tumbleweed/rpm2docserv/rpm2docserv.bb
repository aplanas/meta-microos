SUMMARY = "Make manpages from RPMs accessible in a web browser"
DESCRIPTION = "rpm2docserv extracts manual pages from RPM packages and makes them accessible in a web browser."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "rpm2docserv-20230308.4ed55cf-1.5.aarch64.rpm"
RPM_HASH = "a493d33b58f1e19472a7e532617a03d4efbc12f58f4fe3adcc7eed76c01b56616d1fc1ffec5a71b91d743138783276f5f85245643dfa97346dfc2d55b31392c3"

RPROVIDES:${PN} += "rpm2docserv"

RDEPENDS:${PN} += "/usr/bin/mandoc \
cpio \
libc.so.6"

inherit rpm
