SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python311-dash-2.6.2-1.3.noarch.rpm"
RPM_HASH = "85268230253415186a34fd6c63ef5a60160b44434bf498181808be863776174fb5c720d89c46dfeea211a1fcdab20921f986a86e2b3e20745ac88f99fd0d5795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dash \
python311-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-Flask-Compress \
python311-beautifulsoup4 \
python311-dash-core-components \
python311-dash-html-components \
python311-dash-table \
python311-percy \
python311-plotly \
update-alternatives"

inherit rpm
