SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python39-dash-2.6.2-1.3.noarch.rpm"
RPM_HASH = "56fe6a0afd62ff910b413c41e7c43e8881d1ee7cc619e4e6bf6ea99da167cc1113cec2441d0f4455334a7c87aff5c6e490dd35ca888dea313ffdc1baf1516cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dash) \
python39-dash \
python3dist(dash)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Flask \
python39-Flask-Compress \
python39-beautifulsoup4 \
python39-dash-core-components \
python39-dash-html-components \
python39-dash-table \
python39-percy \
python39-plotly \
update-alternatives"

inherit rpm
