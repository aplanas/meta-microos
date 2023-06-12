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

RPM_NAME = "python310-Pint-0.20.1-1.4.noarch.rpm"
RPM_HASH = "2c267276f77605faf08a108c5f4e859c8d5583194ac6643c8fe6de00eb60e36e727cbff145730c69536a4f9224cf9cdbf819409a95f297aadaed1e1682a6ac8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pint \
python3.10dist(pint) \
python310-Pint \
python3dist(pint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3.10 \
python(abi) \
python310-importlib-metadata \
python310-importlib-resources \
python310-packaging \
python310-uncertainties"

inherit rpm
