SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python39-pycocotools-2.0~post.1582219528.8c9bcc3-2.13.aarch64.rpm"
RPM_HASH = "1c58683a36cd8342836113e9d9474cb57dcf99fdc78e1a7f4d7e3213d7110efa090f1d1b41f1d54931cc97936b9bce827af5460a9be9e839b10dd7820e4ec565"

RPROVIDES:${PN} += "python3.9dist-pycocotools \
python39-cocotools \
python39-pycocotools \
python3dist-pycocotools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Cython \
python39-matplotlib \
python39-setuptools"

inherit rpm
