SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python310-Bottleneck-1.3.7-1.6.aarch64.rpm"
RPM_HASH = "95780b2cb5eccd34fa639d34cdd30c934472314ecb86761a3e0b118a2cb5a6c6c5f8a00ce46822a4a06d49ee1e5225cbfb4225aaecd2ffa5caaac672f2c15049"

RPROVIDES:${PN} += "python3.10dist-bottleneck \
python310-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy"

inherit rpm
