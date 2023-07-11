SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python311-python-stdnum-1.17-1.10.noarch.rpm"
RPM_HASH = "cbf95b46624270151acd5aa03c31527bcaffdc761fa93e6c76a4d45962fca05d31bf73104bb259ecf3e45fa55a8e681566a36afcefc4ae6bf00f351b88719a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-stdnum \
python3.11dist-python-stdnum \
python311-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
