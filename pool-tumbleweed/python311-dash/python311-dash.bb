SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python311-dash-2.6.2-1.5.noarch.rpm"
RPM_HASH = "f3e120faf7c3757d4fe46e5953bdfeaa4553ae12de107530ea94bc652e6176c44f7ac76f8add80e22ddd6c75c50a8153364c8a655fbb896cbffb884775bd64bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash \
python3.11dist-dash \
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
