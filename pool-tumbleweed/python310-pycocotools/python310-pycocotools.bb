SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python310-pycocotools-2.0~post.1582219528.8c9bcc3-2.12.aarch64.rpm"
RPM_HASH = "50b42a7dd7f6e8740f8590f8f4bd4f5f877f7553e107275bd62abfccf5cd454e40ab3970a0ebd3807a9398c00e4dfb0844a1a2832e999376ee8fb6495dc78ade"

RPROVIDES:${PN} += "python3-cocotools \
python3-pycocotools \
python3.10dist-pycocotools \
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
