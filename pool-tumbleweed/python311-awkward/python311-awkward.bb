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

RPM_NAME = "python311-awkward-2.3.1-1.1.noarch.rpm"
RPM_HASH = "cab4f6716cbbcbb40c35b00720de5e2384b28b389b6197880098a794817ada761512444fd908cfc0c0a80e15358da2f3ff1321b4e03d76697cb14c10426df78c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awkward \
python3.11dist-awkward \
python311-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python311-awkward-cpp \
python311-numpy \
python311-packaging"

inherit rpm
