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

RPM_NAME = "python311-tinyarray-1.2.4-2.7.aarch64.rpm"
RPM_HASH = "5b1c1d0283cbeba60b6d8f4e9ca69cd975bd5a984be438ffc29b83f4b94f8520cbda5f9394d770edebd8f7815d695f2aabe05ee7d803be90a5e2ecbc656181c1"

RPROVIDES:${PN} += "python3-tinyarray \
python3.11dist-tinyarray \
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
