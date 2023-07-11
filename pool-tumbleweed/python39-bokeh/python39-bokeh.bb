SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python39-bokeh-3.2.0-1.1.noarch.rpm"
RPM_HASH = "4b5d1e4a886798677adf58b7fa36681afe1bc3ff12dbe4a5d9a4b16f730e8beee03ba94ed6833a0814d9cab4370a16dc5eb791fb126a6d62fdc30ef0a1824e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bokeh \
python39-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-Pillow \
python39-PyYAML \
python39-base \
python39-contourpy \
python39-numpy \
python39-packaging \
python39-pandas \
python39-tornado \
python39-xyzservices \
update-alternatives"

inherit rpm
