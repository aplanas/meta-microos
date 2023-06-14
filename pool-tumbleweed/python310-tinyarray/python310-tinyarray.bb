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

RPM_NAME = "python310-tinyarray-1.2.4-2.5.aarch64.rpm"
RPM_HASH = "8e48ee9b4f131ef5730af5dcf1fcab07ee117c248230f2f10468bc3fe219b8d74116e30891ada8fd21a3f4942890fbb675165650e6f4f7c1f0fa4f29b967d8e8"

RPROVIDES:${PN} += "python3-tinyarray \
python3.10dist-tinyarray \
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
