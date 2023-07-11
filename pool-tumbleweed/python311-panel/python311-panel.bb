SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-panel-1.1.1-1.1.noarch.rpm"
RPM_HASH = "46161ef28e659202a9eb422468bdc6cb72a9bce8ef14f423124a72596b537c7c2a60e05e38e1c3303c1000f938a367122065c18680e8cba02c9ea8fa6d8dacbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panel \
python3.11dist-panel \
python311-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python311-bokeh >= 3.1.1 with python311-bokeh < 3.3.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
jupyter-panel \
python-abi \
python311-Markdown \
python311-bleach \
python311-linkify-it-py \
python311-markdown-it-py \
python311-mdit-py-plugins \
python311-pandas \
python311-param \
python311-pyviz-comms \
python311-requests \
python311-tqdm \
python311-typing-extensions \
python311-xyzservices \
update-alternatives"

inherit rpm
