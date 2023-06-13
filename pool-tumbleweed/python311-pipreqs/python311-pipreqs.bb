SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python311-pipreqs-0.4.10-2.13.noarch.rpm"
RPM_HASH = "d623d25a11810283d1c4db8b6b386b51e4ec1b75492511888454f3088bac75ff7de6be381222fed449ffea7ea00d541b75ff0af5307ed1f979570002852a0ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pipreqs) \
python311-pipreqs \
python3dist(pipreqs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-docopt \
python311-setuptools \
python311-yarg \
update-alternatives"

inherit rpm
