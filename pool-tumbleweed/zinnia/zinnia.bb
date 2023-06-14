SUMMARY = "Online hand recognition system with machine learning"
DESCRIPTION = "Zinnia is a simple, customizable and portable online hand recognition system based on Support Vector Machines. Zinnia simply receives user pen strokes as a sequence of coordinate data and outputs n-best characters sorted by SVM confidence. To keep portability, Zinnia doesn\\'t have any rendering functionality. In addition to recognition, Zinnia provides training module that allows us to create any hand-written recognition systems with low-cost."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-0.07-2.7.aarch64.rpm"
RPM_HASH = "3276320a03892a575d260bf7591728b46d49311a092b3d6eaf2bb11cede921d91b73a37e31a15c03922f41b212b196b2c5737cad75f6d6e59bc28c6bc47ca5fa"

RPROVIDES:${PN} += "zinnia"

RDEPENDS:${PN} += "libc.so.6 \
libzinnia.so.0"

inherit rpm
