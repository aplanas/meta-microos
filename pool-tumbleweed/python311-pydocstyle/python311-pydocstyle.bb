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

RPM_NAME = "python311-pydocstyle-6.3.0-1.4.noarch.rpm"
RPM_HASH = "482abe3b734208dbcf2c4fbefd9c9f28b7c683c4fe75e7e9f061496e12f674e49d3c4a2580d30b9c60776479b3ac725c8b0699f6ddc2ef4f17fb93f49bafde67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydocstyle \
python311-pep257 \
python311-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-snowballstemmer \
update-alternatives"

inherit rpm
