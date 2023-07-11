SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-panel-1.1.1-1.1.noarch.rpm"
RPM_HASH = "74a7317e49c2e8fd636e3310b1b40610b2c9c1b73454f727f7a65b7dbd0584077453b60a491c33cde12b4d3db4d168a8219ba499eb100b9e96eadb15253a78d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-panel \
python310-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python310-bokeh >= 3.1.1 with python310-bokeh < 3.3.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
jupyter-panel \
python-abi \
python310-Markdown \
python310-bleach \
python310-linkify-it-py \
python310-markdown-it-py \
python310-mdit-py-plugins \
python310-pandas \
python310-param \
python310-pyviz-comms \
python310-requests \
python310-tqdm \
python310-typing-extensions \
python310-xyzservices \
update-alternatives"

inherit rpm
