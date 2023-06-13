SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libhwasan0-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "64769b7b9ca84281bbd74c4ca0633178d8609d61277f5c95421efe9076c3acbb82b001a941e2c9d92006c8ab3e161e6addc20592dfba61ad0e99437c880399e2"

RPROVIDES:${PN} += "libhwasan.so.0()(64bit) \
libhwasan0 \
libhwasan0-gcc12 \
libhwasan0-gcc12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
