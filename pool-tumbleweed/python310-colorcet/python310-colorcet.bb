SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python310-colorcet-3.0.1-1.7.noarch.rpm"
RPM_HASH = "e6095b6e298bb708e623e9ba971c6c7fde92bab541ecde92406b3d6ce11a27acd917144b25648cbc5e336a6ec89fb9eb8c76ef555738aee6fe16faef769ef35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colorcet \
python310-colorcet \
python3dist-colorcet"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-param \
python310-pyct \
update-alternatives"

inherit rpm
