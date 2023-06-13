SUMMARY = "Header files for libdisplay-info, an EDID library"
DESCRIPTION = "The library provides a set of low- and high-level functions \
for EDID and DisplayID. \
 \
This package contains headers for the library."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdisplay-info-devel-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "2d6a108d68ddc1a60b46ff9a53a1b796f1a9746ad787e9fb40c1b17166fef6185b240a589f280daefde6b9b1ecfe2e7ade6fd5345748ebec7e294aaaea5448ef"

RPROVIDES:${PN} += "libdisplay-info-devel \
libdisplay-info-devel(aarch-64) \
pkgconfig(libdisplay-info)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdisplay-info.so.1()(64bit) \
libdisplay-info1 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
