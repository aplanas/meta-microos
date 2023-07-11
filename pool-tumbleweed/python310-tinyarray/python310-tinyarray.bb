SUMMARY = "Arrays of numbers for Python, optimized for small sizes"
DESCRIPTION = "Tinyarrays are similar to NumPy arrays, but optimized for small sizes. \
Tinyarrays support mathematical operations like element-wise addition \
and matrix multiplication. Tinyarrays can be used as dictionary keys \
because they are hashable and immutable. Tinyarrays are useful if you \
need many small arrays of numbers, and cannot combine them into a few \
large ones. Common operations on very small arrays are faster than \
with NumPy, and less memory is used to store them."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "python310-tinyarray-1.2.4-2.7.aarch64.rpm"
RPM_HASH = "f5f1f48df489d5d07f29426b1178ab59c0a428b14697325eb645ae9fff798face7e9fc8b5da7e9e2049306bc8fe55e15a4829f6547dab560ba9528b57a6209c3"

RPROVIDES:${PN} += "python3.10dist-tinyarray \
python310-tinyarray \
python3dist-tinyarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
