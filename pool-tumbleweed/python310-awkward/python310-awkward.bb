SUMMARY = "Manipulate arrays of complex data structures as easily as Numpy"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python310-awkward-2.2.4-1.1.noarch.rpm"
RPM_HASH = "ea7151d7d0ead5bf36561b3aed9034a1ab39948e871e57c82846488cc67116810b98c1ef6994bfac6084200159dc4cfcd6ef2891362b4330100c588e8c86df55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-awkward \
python310-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python310-awkward-cpp \
python310-numpy \
python310-packaging"

inherit rpm
