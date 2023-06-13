SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoJSON92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "3e1ba9f5ebee12ce2e3af1869afc0686bdb46b12ea0e140a6137b850e89ccbe078698358189551bbb230da50487a7ff1d9ee49020e4071627f0333ab1766acf0"

RPROVIDES:${PN} += "libPocoJSON.so.92()(64bit) \
libPocoJSON92 \
libPocoJSON92(aarch-64) \
poco-json"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
