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

RPM_NAME = "python311-bokeh2-2.4.3-2.6.noarch.rpm"
RPM_HASH = "f6e5e6bf873d9138eb0d8c86485816ac5e7146857343a5bd50dabc71f40a56b3364dd1b4c9f1770173bf0909fb45c0a4036f02cb457876b004862b0ec99fe42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bokeh \
python311-bokeh \
python311-bokeh2 \
python3dist-bokeh"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Jinja2 \
python311-Pillow \
python311-PyYAML \
python311-numpy \
python311-packaging \
python311-python-dateutil \
python311-tornado \
python311-typing-extensions \
update-alternatives"

inherit rpm
