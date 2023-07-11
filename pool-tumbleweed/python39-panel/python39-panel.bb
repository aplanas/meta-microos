SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-panel-1.1.1-1.1.noarch.rpm"
RPM_HASH = "622769cea704d2dc751666c1c5df719ab9d6b3c70fa6d2d93ff5e7bdeaf255c45fd47d7251b461526add5698040a09797d262ad42f29a4fef426a001549dd4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-panel \
python39-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python39-bokeh >= 3.1.1 with python39-bokeh < 3.3.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
jupyter-panel \
python-abi \
python39-Markdown \
python39-bleach \
python39-linkify-it-py \
python39-markdown-it-py \
python39-mdit-py-plugins \
python39-pandas \
python39-param \
python39-pyviz-comms \
python39-requests \
python39-tqdm \
python39-typing-extensions \
python39-xyzservices \
update-alternatives"

inherit rpm
