SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python311-pycocotools-2.0~post.1582219528.8c9bcc3-2.13.aarch64.rpm"
RPM_HASH = "b7b6c099f59965202bd8fca273de8db1d2c78b30e20f6341bed6b99fa9d083d731a9d22a2d1475230153f26f3dd24cbcef696ca0f358c2ab5eb56ba69ac3889e"

RPROVIDES:${PN} += "python3-cocotools \
python3-pycocotools \
python3.11dist-pycocotools \
python311-cocotools \
python311-pycocotools \
python3dist-pycocotools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Cython \
python311-matplotlib \
python311-setuptools"

inherit rpm
