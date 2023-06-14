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

RPM_NAME = "python311-tinyarray-1.2.4-2.5.aarch64.rpm"
RPM_HASH = "eca76ff8c501b05f3fc2c66f13fb62b394d079686a24057067b484916d23caf99160cd1df86d9bcaee7e9c15fb0ab67c4c47f85af7f105ae6c31c0b2ce5f0e1d"

RPROVIDES:${PN} += "python3.11dist-tinyarray \
python311-tinyarray \
python3dist-tinyarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
