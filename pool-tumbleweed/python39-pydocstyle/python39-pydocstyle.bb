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

RPM_NAME = "python39-pydocstyle-6.3.0-2.3.noarch.rpm"
RPM_HASH = "25119aba5c9d2716a739933f3595503f8f9ab10ed75940c3933070a4cf3aced750695c871920994926b86e863e6694e91c79b9e68e062cb8e900aef56350ef60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydocstyle \
python39-pep257 \
python39-pydocstyle \
python3dist-pydocstyle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-snowballstemmer \
update-alternatives"

inherit rpm
