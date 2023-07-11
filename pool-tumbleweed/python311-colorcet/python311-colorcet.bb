SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python311-colorcet-3.0.1-1.7.noarch.rpm"
RPM_HASH = "83826f31dce6db00bbad2bd5ba9eba552284fb40579927558dd97b24e39f2e4329903f8175990623a56a666323cf33b0bc614c9e27e85eb2cd4f7d168bf985e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorcet \
python3.11dist-colorcet \
python311-colorcet \
python3dist-colorcet"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-param \
python311-pyct \
update-alternatives"

inherit rpm
