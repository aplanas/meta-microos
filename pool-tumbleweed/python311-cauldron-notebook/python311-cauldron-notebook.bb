SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-cauldron-notebook-1.0.9-1.3.noarch.rpm"
RPM_HASH = "23753fe162c6f51678d75f80f5a74a23e3b1ab29f9689b84bffaa71dbb61e8e6a3eaaafa94bb2c68da0144768084eb304a4a5b68166d3a17c26e79b1ebb7ab7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cauldron-notebook \
python311-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-Jinja2 \
python311-Markdown \
python311-beautifulsoup4 \
python311-numpy \
python311-pandas \
python311-pygments \
python311-requests \
update-alternatives"

inherit rpm
