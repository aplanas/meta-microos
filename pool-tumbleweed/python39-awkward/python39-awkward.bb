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

RPM_NAME = "python39-awkward-2.2.4-1.1.noarch.rpm"
RPM_HASH = "2fd512cf4852dd0592883df1232df6c33897496969ae734a962a716f55ce4a35f25668a702cbf59fe74ae8d3e401e337ea3ef8c09136e68295102d17528022e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-awkward \
python39-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python39-awkward-cpp \
python39-numpy \
python39-packaging"

inherit rpm
