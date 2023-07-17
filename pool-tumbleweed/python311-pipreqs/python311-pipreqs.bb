SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.13"

RPM_NAME = "python311-pipreqs-0.4.13-1.1.noarch.rpm"
RPM_HASH = "011f4c1fb141452481d8d0e9b8bb6e3a11d791016bed7279da4711db1c3f388b5379df10483612998e86a10a5d6787ada8e476601b6645a273d3ec76d105031d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipreqs \
python3.11dist-pipreqs \
python311-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
python311-yarg \
update-alternatives"

inherit rpm
