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

RPM_NAME = "python311-awkward-2.1.4-2.1.noarch.rpm"
RPM_HASH = "0923d37c341ecdab7d66f36675a41c71e807bbb0e11bc8880f74ce1ef3fb1fb5e928afcd843de44d0e9c6ee9a37ba5e89566b77289cf7d7829ecf8c57ddf23d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-awkward \
python311-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "-python311-importlib-resources if python311-base < 3.9 \
-python311-typing-extensions >= 4.1.0 if python311-base < 3.11 \
python-abi \
python311-awkward-cpp \
python311-numpy \
python311-packaging"

inherit rpm
