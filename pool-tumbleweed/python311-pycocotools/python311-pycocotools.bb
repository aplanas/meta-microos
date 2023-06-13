SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python311-pycocotools-2.0~post.1582219528.8c9bcc3-2.12.aarch64.rpm"
RPM_HASH = "982ff9d641830293bab58ab8fdcfe5c0be5582cfc2661f813b88fda775899c05bc950fa2177af48f003f6c3ddfcc63cbd2362fa42a561c117162e9aa6654230a"

RPROVIDES:${PN} += "python3.11dist(pycocotools) \
python311-cocotools \
python311-pycocotools \
python311-pycocotools(aarch-64) \
python3dist(pycocotools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-Cython \
python311-matplotlib \
python311-setuptools"

inherit rpm
