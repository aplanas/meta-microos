SUMMARY = "Load ICC profile calibration part to graphics card"
DESCRIPTION = "The command line tool applies the 'vcgt'-tag of ICC profiles to your X-server \
like MS-Windows or MacOS can to set your display to a calibrated state. \
 \
Versions 0.5 and higher are also usable with Microsoft Windows. \
They can be used as a free alternative to other calibration loaders."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "xcalib-0.10-1.8.aarch64.rpm"
RPM_HASH = "ac98f5b386ee5c776e2dbf3f8fd213a49b6bad0562f76d098d9ca8a482012fa61568166702a3553805684cb16843bfc6311de11a7b480263f1aee124fe0cfe60"

RPROVIDES:${PN} += "xcalib \
xcalib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
