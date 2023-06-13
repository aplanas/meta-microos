SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python310-PyChart-1.39-1.14.noarch.rpm"
RPM_HASH = "3afb2f38cfcb0d13c25a49a3a75a5f0e96bf7bb04c6eb363251055fa2eb081043b184b58d3c9eccad62514e4e4d5f6df36e263231db1935ac6be55d0673597a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChart \
python3.10dist(pychart) \
python310-PyChart \
python3dist(pychart)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
