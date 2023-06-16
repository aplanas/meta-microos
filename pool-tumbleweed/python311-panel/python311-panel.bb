SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python311-panel-0.14.4-1.2.noarch.rpm"
RPM_HASH = "1927443b6b24aa8a3cd80d3fd45a03edf18279ae71b587ecbe926b826e4becf48d8c03a0d5a5d171c85e4314ef7b433655e09091e18639aea536f4958b845ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-panel \
python311-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python311-bokeh >= 2.4.3 with python311-bokeh < 2.5 \
/usr/bin/python3.11 \
/usr/bin/sh \
jupyter-panel \
python-abi \
python311-Markdown \
python311-bleach \
python311-param \
python311-pyct \
python311-pyviz-comms \
python311-requests \
python311-setuptools \
python311-tqdm \
python311-typing-extensions \
update-alternatives"

inherit rpm
