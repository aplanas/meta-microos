SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python39-dash-2.6.2-1.5.noarch.rpm"
RPM_HASH = "0438c7118cd06d0762a678439bd5d243bd74a68876417bfc10c15d01790a9cbf157ba7af11dc213da4b301975ebb95e7a4f6db0ab61b2686912593e142e5b2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dash \
python39-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
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
