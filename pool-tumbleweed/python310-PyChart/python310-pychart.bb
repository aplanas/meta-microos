SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python310-PyChart-1.39-1.15.noarch.rpm"
RPM_HASH = "9c9ac89c5962c2de79f47c98194b44eb342ea3610e0ac19a08fec912f32f217b050882ac36a2859ecfd55ab7fe69796352ba5bc9e87207c30b3d39fafbf16d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pychart \
python310-PyChart \
python3dist-pychart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
