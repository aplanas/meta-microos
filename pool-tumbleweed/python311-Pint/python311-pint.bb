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

RPM_NAME = "python311-Pint-0.20.1-1.4.noarch.rpm"
RPM_HASH = "92b27706bcbc1abb0cf78bf8d9d3d5041cfb565f8734654ee5aa1b950e7a279f175110b4451e42504f50d8331896ff109d2ab7dc87890e3b87470dc116923023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pint \
python311-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-importlib-metadata \
python311-importlib-resources \
python311-packaging \
python311-uncertainties"

inherit rpm
