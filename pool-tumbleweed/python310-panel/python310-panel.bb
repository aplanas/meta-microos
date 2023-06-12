SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python310-panel-0.14.4-1.2.noarch.rpm"
RPM_HASH = "fbca07215e5f62b8da408d8f6c859d094180f7eca530f827f0a0aff577d43009c7240f3e7d9e565bb7159cc6d8a118406daf16d7107c7d9b9be642f94402f2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panel \
python3.10dist(panel) \
python310-panel \
python3dist(panel)"
RDEPENDS:${PN} += "(python310-bokeh >= 2.4.3 with python310-bokeh < 2.5) \
/bin/sh \
/usr/bin/python3.10 \
jupyter-panel \
python(abi) \
python310-Markdown \
python310-bleach \
python310-param \
python310-pyct \
python310-pyviz-comms \
python310-requests \
python310-setuptools \
python310-tqdm \
python310-typing_extensions \
update-alternatives"

inherit rpm
