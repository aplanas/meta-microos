SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python310-pipreqs-0.4.10-2.13.noarch.rpm"
RPM_HASH = "3b68bf84c87723c2db103fb0d9960ea9227d7e35fd051fb70b4806907328cab6ddf984e1fa465e9560c53d0e3b187030b8bbf1a2ee26a3d5bd78bfcee24d5e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipreqs \
python3.10dist-pipreqs \
python310-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-docopt \
python310-setuptools \
python310-yarg \
update-alternatives"

inherit rpm
