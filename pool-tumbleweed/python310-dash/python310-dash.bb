SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python310-dash-2.6.2-1.3.noarch.rpm"
RPM_HASH = "d747d442ab99e72a8673815768b2d03ae0cb1d91e02ec446fc7abef8c7f01d1e793a540b7e5fa84931e30d772c32bb9ad8bccaea6263345b73615b0ee51ea8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash \
python3.10dist(dash) \
python310-dash \
python3dist(dash)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Flask \
python310-Flask-Compress \
python310-beautifulsoup4 \
python310-dash-core-components \
python310-dash-html-components \
python310-dash-table \
python310-percy \
python310-plotly \
update-alternatives"

inherit rpm
