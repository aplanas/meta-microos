SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python310-bokeh-3.1.1-1.1.noarch.rpm"
RPM_HASH = "9f2446011e2ae4e3b4a86a582e958be3ccfbb2a1416a97bd7fa7a9136f156a77791573e0efc69f09ab10d4f5597f42d8d8ff6d5f719e1f911cf79e9a5a0cd3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh \
python3.10dist-bokeh \
python310-bokeh \
python3dist-bokeh"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
