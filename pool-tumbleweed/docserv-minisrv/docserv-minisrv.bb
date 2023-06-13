SUMMARY = "Simple docserv webserver"
DESCRIPTION = "Simple docserv webserver with integrated auxserver for development and test purposes. Not for production."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-minisrv-20230308.4ed55cf-1.4.aarch64.rpm"
RPM_HASH = "3aa5fdd4667610f036d9a83b79d3e8beebc873643f438d180428791eb0bcea5a5c0feeea4bc5bd2459957587b6bd0e3ee7bd786c2d67e73557d7255cfdf65457"

RPROVIDES:${PN} += "docserv-minisrv \
docserv-minisrv(aarch-64) \
group(docserv-srv) \
user(docserv-srv)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
sysuser-shadow"

inherit rpm
