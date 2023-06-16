SUMMARY = "Python docstring style checker"
DESCRIPTION = "pydocstyle is a static analysis tool for checking compliance with \
Python docstring conventions. \
 \
pydocstyle supports most of PEP 257 out of the box, but it should not \
be considered a reference implementation. \
 \
The framework for checking docstring style is flexible, and custom \
checks can be easily added, for example to cover NumPy docstring \
conventions."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-pydocstyle-6.3.0-1.4.noarch.rpm"
RPM_HASH = "ade7d4c04e8553cdf09a91cf6d71eb7af8520fb9db6d0fce797f689da3fca758757351ac7b3c0791bf1cc51e05af56e760da16b819f7e89d4243ffe79913da5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep257 \
python3-pydocstyle \
python3.10dist-pydocstyle \
python310-pep257 \
python310-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-snowballstemmer \
update-alternatives"

inherit rpm
