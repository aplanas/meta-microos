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

RPM_NAME = "python310-awkward-2.3.1-1.1.noarch.rpm"
RPM_HASH = "a3386ea82984b2d633aec07afcf2337d6eec5939f24d39a146086d556cac305da3ffff40f16006183be3a3e89f6056f7b6256a3c58f586772e9afe523493af70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-awkward \
python310-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python310-awkward-cpp \
python310-numpy \
python310-packaging"

inherit rpm
