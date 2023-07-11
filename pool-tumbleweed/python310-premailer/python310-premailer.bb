SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python310-premailer-3.10.0-1.5.noarch.rpm"
RPM_HASH = "3f6512749aa926fa4752294ad6f5b11ee9385c0bc4520d88a774291ce53c2d92e55d991edea982a929085eff382e9199ac066f705e78284c281d40599d33836f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-premailer \
python310-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python310-cachetools \
python310-cssselect \
python310-cssutils \
python310-lxml \
python310-requests"

inherit rpm
