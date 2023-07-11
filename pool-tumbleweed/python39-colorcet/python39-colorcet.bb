SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python39-colorcet-3.0.1-1.7.noarch.rpm"
RPM_HASH = "bf14a4222e9b30a06b72c1229c2d37c62740ea04363b8b562c48815d4b68d137952b1f334b66aaded90f1e952e19349ca91d39e5efbfe37a6caa014a9d029621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorcet \
python39-colorcet \
python3dist-colorcet"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-param \
python39-pyct \
update-alternatives"

inherit rpm
