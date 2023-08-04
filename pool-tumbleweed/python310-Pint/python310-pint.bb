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

RPM_NAME = "python310-Pint-0.22-1.1.noarch.rpm"
RPM_HASH = "17acfb88cd2fb346d91bb6c1d22edbf273d2d764d1fc5db5515a8a7efa3c9552df328271dace0deca2ed05449c85a564b87c2aeed818ce35231cef7bf0e7d814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pint \
python310-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-uncertainties"

inherit rpm
