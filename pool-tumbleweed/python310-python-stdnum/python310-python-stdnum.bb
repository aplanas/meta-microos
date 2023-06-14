SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python310-python-stdnum-1.17-1.8.noarch.rpm"
RPM_HASH = "0e09883b78aba16f813cecf2ebdd037a3230ae2f3bd27c375f27d99d107f85ca733826816145d4bf534643e6f4d5cc8d14ffb719440844c1a83443079a7cdfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-stdnum \
python3.10dist-python-stdnum \
python310-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
