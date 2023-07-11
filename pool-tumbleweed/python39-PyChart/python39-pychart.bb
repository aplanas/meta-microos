SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python39-PyChart-1.39-1.15.noarch.rpm"
RPM_HASH = "0dc0902ea3c444eb6ea9ae1ebb416aba7ab61c3c3e53ab68fb21cf5d2c6922bfb84f4d00a058e78cdff8bd33da7def263a76ff21606ca882fde38bf02dc901bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pychart \
python39-PyChart \
python3dist-pychart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
