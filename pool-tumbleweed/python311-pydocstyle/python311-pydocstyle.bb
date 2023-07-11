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

RPM_NAME = "python311-pydocstyle-6.3.0-2.3.noarch.rpm"
RPM_HASH = "6c6a67a1013f4951246e144023d9605fb960a4a25151083a3a64a1b80c863234ab918b37806254d9c5770b7e3a7ff8d7541e53b7b4da4e433826535f697390bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep257 \
python3-pydocstyle \
python3.11dist-pydocstyle \
python311-pep257 \
python311-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-snowballstemmer \
update-alternatives"

inherit rpm
