SUMMARY = "Conversion utilities for X Pixmap (XPM) files"
DESCRIPTION = "The spxm tool converts XPM1/XPM2 files to XPM version 3. \
The cxpm tool will check whether an XPM file is correct or not with \
regard to its format."
LICENSE = "MIT"

PV = "3.5.16"

RPM_NAME = "libXpm-tools-3.5.16-1.1.aarch64.rpm"
RPM_HASH = "8a2fd938e43b3688c3dccdc6da256e342d6690e1b560e504c2342a801c5d14ea053696248cf2ceffd4cc7502b323d1fddcf371044a6c978cc3afb2ed240897a9"

RPROVIDES:${PN} += "libXpm-tools \
libXpm-tools(aarch-64) \
xorg-x11-libXpm"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
