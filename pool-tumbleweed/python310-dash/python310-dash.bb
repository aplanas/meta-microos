SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python310-dash-2.6.2-1.5.noarch.rpm"
RPM_HASH = "470f0133ee72ebccb0f775679827f139a560551080b6b1e1b199b274b8637058abb57b05e48a55948c7aca091606bb59e7f4bd8e7609d0026177ba9f2e2fed41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash \
python310-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
