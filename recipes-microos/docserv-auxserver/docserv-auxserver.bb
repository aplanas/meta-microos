SUMMARY = "Docserv auxiliary service endpoints"
DESCRIPTION = "docserv-auxserver has a very efficient, small map to redirect to the correct manual page for rpm2docserv created html repositories."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-auxserver-20230308.4ed55cf-1.3.aarch64.rpm"
RPM_HASH = "f90956820458468ee8617281c51710200debd3501c3fcf8a331a7997e555138c598d10dca2e3d6f9abd7bf00a790328e6f7d8969e2d213e13938843965435a92"

RPROVIDES:${PN} += "docserv-auxserver docserv-auxserver(aarch-64) group(docserv-aux) user(docserv-aux)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) sysuser-shadow"

inherit rpm
