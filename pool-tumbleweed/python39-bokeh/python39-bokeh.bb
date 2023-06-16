SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python39-bokeh-3.1.1-1.1.noarch.rpm"
RPM_HASH = "ba4ffbef385069c32b646ad535a153cf9c3f785cd48f9a823b05ce683ae17b9d351143e9f96f9e42bfdcbccc552b3ccf0d43558f96562f788baf98880729d6d3"
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
