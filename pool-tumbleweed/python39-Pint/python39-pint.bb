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

RPM_NAME = "python39-Pint-0.22-1.1.noarch.rpm"
RPM_HASH = "e5a93b3af87c5f5f48cc0113ab26f878ee7c5fd0a33140d40375116e1b79416ca4ca519452ddf589ce18ea38ad54bfda0a379ec12731c83c1d49b9f9b689225b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pint \
python39-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-uncertainties"

inherit rpm
