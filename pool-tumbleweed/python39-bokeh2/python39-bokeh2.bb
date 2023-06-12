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

RPM_NAME = "python39-bokeh2-2.4.3-2.6.noarch.rpm"
RPM_HASH = "82d3389b91f4d6db6d37f59c0f64db633d5197c73bd231119edbcb46ad381ea8174103ef6d7d7751a4622e6b39aa18a5322b2793d6c433c3cb9bfc4a8d97b7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bokeh) \
python39-bokeh \
python39-bokeh2 \
python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Jinja2 \
python39-Pillow \
python39-PyYAML \
python39-numpy \
python39-packaging \
python39-python-dateutil \
python39-tornado \
python39-typing_extensions \
update-alternatives"

inherit rpm
