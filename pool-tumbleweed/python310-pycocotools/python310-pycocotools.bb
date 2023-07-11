SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python310-pycocotools-2.0~post.1582219528.8c9bcc3-2.13.aarch64.rpm"
RPM_HASH = "d0f3e3174b38749ad8c151bd942dc1e16baf3364f6ce9b1f65b503cebff8ee2cd47ade3a03bcff880bdead1562bffb709fe1291534fa95b0efce52910f15a971"

RPROVIDES:${PN} += "python3.10dist-pycocotools \
python310-cocotools \
python310-pycocotools \
python3dist-pycocotools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython \
python310-matplotlib \
python310-setuptools"

inherit rpm
