SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets. \
 \
This package provides the version from the 2.4 branch until all consuming \
packages are ready for Bokeh 3."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python310-bokeh2-2.4.3-2.6.noarch.rpm"
RPM_HASH = "bf42ee0349893174518cba117a6cc2d025c91b102fbad6aeef7e85e36a7f9cea4af1ea324966a2926be79cc6a0d5fb36c0f9920a4ba6357b75e2e74872a1c5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh \
python3-bokeh2 \
python3.10dist(bokeh) \
python310-bokeh \
python310-bokeh2 \
python3dist(bokeh)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-Pillow \
python310-PyYAML \
python310-numpy \
python310-packaging \
python310-python-dateutil \
python310-tornado \
python310-typing_extensions \
update-alternatives"

inherit rpm
