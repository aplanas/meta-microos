SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libpostproc57-6.0-2.2.aarch64.rpm"
RPM_HASH = "5c9e542979ccddc80445e4d466c502b1059b5af9a89ad8c4ee201e18ecda133d5274e175b8bf9e8be01a4fded2337a79ed637e35a725816487655a4179a80c1b"

RPROVIDES:${PN} += "libpostproc.so.57 \
libpostproc57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6"

inherit rpm
