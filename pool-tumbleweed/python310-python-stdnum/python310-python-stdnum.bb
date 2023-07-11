SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python310-python-stdnum-1.17-1.10.noarch.rpm"
RPM_HASH = "7ccd0018cb85797c0805508c210aed08093da209e1c4d9a285c49ebdccebb63d979fe3500b48934d27341338ab3f8a1d2802f41d9692f8937dc44404159361b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-stdnum \
python310-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
