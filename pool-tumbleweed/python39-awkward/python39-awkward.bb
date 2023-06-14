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

RPM_NAME = "python39-awkward-2.1.4-2.1.noarch.rpm"
RPM_HASH = "7567ca7e94d3a0e022f318b2abf8ac99a83b6120a4b3424835dc04b83888714e60d5f4b726a332783596c9b35fa14c595e662df7ea21f5816d987c98aa56a072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-awkward \
python39-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python39-awkward-cpp \
python39-numpy \
python39-packaging"

inherit rpm
