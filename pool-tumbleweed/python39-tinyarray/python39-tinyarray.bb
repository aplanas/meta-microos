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

RPM_NAME = "python39-tinyarray-1.2.4-2.7.aarch64.rpm"
RPM_HASH = "bed338bca3ce756308d288a4afe5eb96bb0808a9dfb7927271ccaba7cbc256a7a44c6c5918d32bc4fa69f6479a2cf348221931028a1a970191261cd2e705bd4c"

RPROVIDES:${PN} += "python3.9dist-tinyarray \
python39-tinyarray \
python3dist-tinyarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
