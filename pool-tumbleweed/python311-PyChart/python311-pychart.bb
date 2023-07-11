SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python311-PyChart-1.39-1.15.noarch.rpm"
RPM_HASH = "2b25c29b778d1d286683c2e2fb455fe87e90f2d0d041347b4c2ef33d98e0372ce384a64d295f115b91aad5271e14d58184896df16fd6983adec6928e674c8f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChart \
python3.11dist-pychart \
python311-PyChart \
python3dist-pychart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
