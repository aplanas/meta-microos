SUMMARY = "Video stabilization libraries for OpenCV"
DESCRIPTION = "Video stabilization libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videostab407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "ca14e8414d5b3a42c7d44db65013284eda7906dba674728634468e481b50b5f2d7814c2f491b1cbe02d2ab043301a5715170869d1e537ad65ee8248023adcdf3"

RPROVIDES:${PN} += "libopencv-videostab.so.407 \
libopencv-videostab407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-features2d.so.407 \
libopencv-imgproc.so.407 \
libopencv-photo.so.407 \
libopencv-video.so.407 \
libopencv-videoio.so.407 \
libstdc++.so.6"

inherit rpm
