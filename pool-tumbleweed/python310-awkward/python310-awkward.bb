SUMMARY = "Manipulate arrays of complex data structures as easily as Numpy"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "python310-awkward-2.1.4-2.1.noarch.rpm"
RPM_HASH = "f52d08c6db6a479e4308122e2a865fff4ed06f6f12a9c41c6f0d421204f509f5e42611896b921dd94efc6cb86eb6a812e3998fce9ec267ffbbc5b1063d008d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awkward \
python3.10dist-awkward \
python310-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python310-awkward-cpp \
python310-numpy \
python310-packaging"

inherit rpm
