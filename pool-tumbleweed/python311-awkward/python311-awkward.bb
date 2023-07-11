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

RPM_NAME = "python311-awkward-2.2.4-1.1.noarch.rpm"
RPM_HASH = "bf0e280186310484c50ca7ad26349491e5236759e98b60683e97350a395d9fc1cd0c89b129580c81fab294a558064edebd1e216ca67e4b5ccdcfafa0baca4548"
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
