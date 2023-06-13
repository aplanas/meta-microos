SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python310-colorcet-3.0.1-1.5.noarch.rpm"
RPM_HASH = "fabb389e9fb4bd2c5806c7d0f2fa2a9e8ad059e20cbcaaa425fb5c665a3bfb724f4c378a321d9b1d236518991cc282a998ef6bf0e7d771c7bb2cfa6b00e43763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorcet \
python3.10dist(colorcet) \
python310-colorcet \
python3dist(colorcet)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-param \
python310-pyct \
update-alternatives"

inherit rpm
