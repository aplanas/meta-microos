SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python310-pipreqs-0.4.10-3.3.noarch.rpm"
RPM_HASH = "b646cc6619e71a707f9f1ea618b2a945d48a04a0fb1e3515ec07edbb69780926f6303355a52f9d08e46d90df05839d9a71a0585b126f1acd855f50ef47318d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pipreqs \
python310-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docopt \
python310-setuptools \
python310-yarg \
update-alternatives"

inherit rpm
