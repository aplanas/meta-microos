SUMMARY = "Includes libraries and headers for the ipmiutil package"
DESCRIPTION = "The ipmiutil-devel package contains headers and libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-devel-3.1.8-1.4.aarch64.rpm"
RPM_HASH = "acdad2c258855494aec140a7981c8b72d31919b829cda2b3b9328b45a139ad3ccf63c202fa6895cbe1961c330ba29fb27307994659ae13cf82c48695e00fa589"

RPROVIDES:${PN} += "ipmiutil-devel \
libipmiutil.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipmiutil \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
