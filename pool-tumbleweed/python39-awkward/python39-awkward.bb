SUMMARY = "Manipulate arrays of complex data structures as easily as Numpy"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python39-awkward-2.3.1-1.1.noarch.rpm"
RPM_HASH = "6535d1e59219ca4d40072654ffa46d2cfd3d80e0ff733459dc43bcea0e373615196e7bece841940314133b138053ebadac60f75ab6c6d15cc3a0eac69d7f6216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-awkward \
python39-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python39-awkward-cpp \
python39-numpy \
python39-packaging"

inherit rpm
