SUMMARY = "Image processing library for extended camera features and video analysis"
DESCRIPTION = "libXCam is a project for extended camera features and focus on image quality \
improvement and video analysis. There are lots features supported in image \
pre-processing, image post-processing and smart analysis. This library makes \
GPU/CPU/ISP working together to improve image quality. OpenCL is used to improve \
performance in different platforms."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "libxcam1-1.5.0-4.6.aarch64.rpm"
RPM_HASH = "37a9c2120e4df303397ae8a352483a16c8a36a076e15dcc10a926cd2787e27dfbe718d5009cd7448eed1f8abec637d5fae327466bac1d2318bb8a1cc9528697c"

RPROVIDES:${PN} += "gstreamer1 \
libgstxcamfilter.so \
libgstxcamsrc.so \
libxcam-capi.so.1 \
libxcam-core.so.1 \
libxcam-gles.so.1 \
libxcam-ocl.so.1 \
libxcam-soft.so.1 \
libxcam-vulkan.so.1 \
libxcam1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-features2d.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-photo.so.407 \
libopencv-stitching.so.407 \
libopencv-video.so.407 \
libstdc++.so.6 \
libvulkan.so.1"

inherit rpm
