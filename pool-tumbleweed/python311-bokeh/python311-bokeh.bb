SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python311-bokeh-3.2.0-1.1.noarch.rpm"
RPM_HASH = "0f6be3399d8f1672fed01f9eca3b8e91c0b5fc64dcea1adb661b034f735c31fa232dad9fef65b14b84e25e0244e28a99736a09f47603ca61f1f2335e8fa4fdd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh \
python3.11dist-bokeh \
python311-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-Pillow \
python311-PyYAML \
python311-base \
python311-contourpy \
python311-numpy \
python311-packaging \
python311-pandas \
python311-tornado \
python311-xyzservices \
update-alternatives"

inherit rpm
