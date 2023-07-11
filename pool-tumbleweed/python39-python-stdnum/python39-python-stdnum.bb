SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python39-python-stdnum-1.17-1.10.noarch.rpm"
RPM_HASH = "9e113383d2f3d933fd1b3c42b8a092d54dbf66a6219b224f43fc1a4a5502a751f16d8db9a5faf983f6d18ae95b2549d0555d5ccf5127368f233fd0561d3b4401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-stdnum \
python39-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
