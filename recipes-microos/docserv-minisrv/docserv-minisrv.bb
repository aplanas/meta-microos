SUMMARY = "Simple docserv webserver"
DESCRIPTION = "Simple docserv webserver with integrated auxserver for development and test purposes. Not for production."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-minisrv-20230308.4ed55cf-1.3.aarch64.rpm"
RPM_HASH = "84c3c341f3de9c9c4430d9baf0faf47c90ae105e6ecfcbb2a515d544b9977e973b67d4557dfdd2d674057f5acb227a47d7f2170924484ec3b00b934e3a3edc6f"

RPROVIDES:${PN} += "docserv-minisrv docserv-minisrv(aarch-64) group(docserv-srv) user(docserv-srv)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) sysuser-shadow"

inherit rpm
