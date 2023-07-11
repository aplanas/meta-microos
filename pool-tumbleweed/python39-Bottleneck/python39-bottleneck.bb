SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python39-Bottleneck-1.3.7-1.6.aarch64.rpm"
RPM_HASH = "83eef6229bd3d10a2130d0655774bf13d6ed84fe0c8304397c7eddd2572856a8e4bb44157f42d60188331c90e13c5d658b8cdc12d6c3d3b783def135a25b2564"

RPROVIDES:${PN} += "python3.9dist-bottleneck \
python39-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy"

inherit rpm
