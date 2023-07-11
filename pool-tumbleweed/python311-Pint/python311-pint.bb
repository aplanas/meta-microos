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

RPM_NAME = "python311-Pint-0.20.1-1.6.noarch.rpm"
RPM_HASH = "b9860d113254a1b461e65b98969fa9694d15d0fb9f8097d25c18a42a5fc060dec02a5ce37e9e46d1866fc0f45031f3015f0349301877814051bbc6ac0cd812a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pint \
python3.11dist-pint \
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
