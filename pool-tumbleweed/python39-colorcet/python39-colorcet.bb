SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python39-colorcet-3.0.1-1.5.noarch.rpm"
RPM_HASH = "2aeb1452b67bfcd48cd307f45238b1cf5ac6bfc2225d969c8ca446717edbcb2a5776a4d0da920fa66da3f8d0a57ccd8d44958e7ef6105dafe2fe9de4252f01e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(colorcet) \
python39-colorcet \
python3dist(colorcet)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-param \
python39-pyct \
update-alternatives"

inherit rpm
