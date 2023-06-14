SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python310-Bottleneck-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "be3faa9e6500b1a031521f8439b3521400b0f7c2eb31a793e25ce923afa7cbe16d32bac0c96c497a1dd60aef24f223a0f931034b369ee6d432a80d9823e3fbeb"

RPROVIDES:${PN} += "python3-Bottleneck \
python3.10dist-bottleneck \
python310-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy"

inherit rpm
