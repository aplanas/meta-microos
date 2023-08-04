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

PV = "0.22"

RPM_NAME = "python311-Pint-0.22-1.1.noarch.rpm"
RPM_HASH = "4c7d79190460e59c43e64487e9f3d73f1c6b1e4043b37cfbae80cc7bd25f694763238338650fda16cc29242f9a8ed7b46d269e3b7bcef3a6ab2868f971b6cd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pint \
python3.11dist-pint \
python311-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-uncertainties"

inherit rpm
