SUMMARY = "Samsung Mobile Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Mobile devices. \
 \
Official supported devices (but not limited to) are: \
 * GT-I9000 \
 * GT-I9100[T] \
 * GT-I9300 \
 * GT-I9505 \
 * SGH-I727 \
 * SGH-I777 \
 * SGH-I927 \
 * SGH-I797"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-1.4.2-1.28.aarch64.rpm"
RPM_HASH = "930ea7c20174c400689e92fdc7b9c82c08f963ba71b6bce56b5a37574a5150303d9a6dd1ff0a529d1acb4e2fd8cc5384725e8454d867079828178e5bf691aee4"

RPROVIDES:${PN} += "heimdall \
heimdall(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
