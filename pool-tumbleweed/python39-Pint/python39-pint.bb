SUMMARY = "Physical quantities module"
DESCRIPTION = "Pint is Python module/package to define, operate and manipulate physical \
quantities, the product of a numerical value and a unit of measurement. \
It allows arithmetic operations between them and conversions from and \
to different units. \
 \
It is distributed with a comprehensive list of physical units, prefixes \
and constants. Due to it's modular design, you to extend (or even rewrite!) \
the complete list without changing the source code."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python39-Pint-0.20.1-1.6.noarch.rpm"
RPM_HASH = "e675331c7fa2267f89c7b4c2c8be1fb143e86888df0293477320ce79f8bf3974757110657399d4a070577b7498c3b5aab561a189badd9b7d838f6c6082d1cc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pint \
python39-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-metadata \
python39-importlib-resources \
python39-packaging \
python39-uncertainties"

inherit rpm
