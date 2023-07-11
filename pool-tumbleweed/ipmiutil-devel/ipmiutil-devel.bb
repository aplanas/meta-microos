SUMMARY = "Includes libraries and headers for the ipmiutil package"
DESCRIPTION = "The ipmiutil-devel package contains headers and libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-devel-3.1.8-1.5.aarch64.rpm"
RPM_HASH = "49103a06f506206550ca2b498b2fb9d2c4b9f09b3956975e7b88ffe8b7cd8843a715e70755a006bd7c4cf3f8b0700b2ab6fcc320cdd19327e366c7c8b16f26dd"

RPROVIDES:${PN} += "ipmiutil-devel \
libipmiutil.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipmiutil \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
