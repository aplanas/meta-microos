SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python310-bokeh-3.2.0-1.1.noarch.rpm"
RPM_HASH = "8ea3613539272d1507292f8ca0fd0941fa8523cafa3404f5cbb40b5b49ae1c1820dc0cc93e762b006101555d43afc52251002d2251735c1ff2bdafbb8aa5cde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bokeh \
python310-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-Pillow \
python310-PyYAML \
python310-base \
python310-contourpy \
python310-numpy \
python310-packaging \
python310-pandas \
python310-tornado \
python310-xyzservices \
update-alternatives"

inherit rpm
