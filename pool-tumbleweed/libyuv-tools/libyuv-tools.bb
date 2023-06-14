SUMMARY = "Command line utilities from libyuv"
DESCRIPTION = "libyuv is a project for YUV image scaling and conversion. It can \
convert between RGB and YUV, scale images with point/bilinear/box \
filter, rotate by 90/180/270°, and offers SSE/NEON/MSA acceleration. \
 \
This package contains the yuvconvert and yuvconstants commandline programs."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv-tools-20230517+a377993-1.1.aarch64.rpm"
RPM_HASH = "ceaddb2e525447fad71780efeb8cfcf7d87dad499c67632a78712348c8afd142167a35e486d5a3773eb261274a382d8e876e843c4db5283056de4f74b88f8a74"

RPROVIDES:${PN} += "libyuv-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyuv.so.0"

inherit rpm
