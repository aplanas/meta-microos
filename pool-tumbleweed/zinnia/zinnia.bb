SUMMARY = "Online hand recognition system with machine learning"
DESCRIPTION = "Zinnia is a simple, customizable and portable online hand recognition system based on Support Vector Machines. Zinnia simply receives user pen strokes as a sequence of coordinate data and outputs n-best characters sorted by SVM confidence. To keep portability, Zinnia doesn\\'t have any rendering functionality. In addition to recognition, Zinnia provides training module that allows us to create any hand-written recognition systems with low-cost."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "zinnia-0.07-2.8.aarch64.rpm"
RPM_HASH = "be979467504779747464669376676e5ae64d7cc0f37e6e441dca263d3e597de79cd2f6dac09ecee91687b0f7edf4a65aa7d8d13cf3c598923027b2a5888654e8"

RPROVIDES:${PN} += "zinnia"

RDEPENDS:${PN} += "libc.so.6 \
libzinnia.so.0"

inherit rpm
