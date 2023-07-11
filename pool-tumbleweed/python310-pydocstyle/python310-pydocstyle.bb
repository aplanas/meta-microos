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

RPM_NAME = "python310-pydocstyle-6.3.0-2.3.noarch.rpm"
RPM_HASH = "d1db2b9a8cee4e44bcd36e46444d9aec1eea8209ce87240937b15fc651a54ea909ef42f8f1fae05662d031843bd8ca1296db8b7c6ccd02739185ff636041c4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydocstyle \
python310-pep257 \
python310-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-snowballstemmer \
update-alternatives"

inherit rpm
