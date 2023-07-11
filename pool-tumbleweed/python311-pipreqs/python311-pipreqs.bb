SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python311-pipreqs-0.4.10-3.3.noarch.rpm"
RPM_HASH = "eda83a1e19bf4fbb128dee6b421d6bc234a3e8c8b25ad29563d95f13577ac111a124af56f5b34d65701bf33bcc251180793d7a3f2f35cf637220e7ebdd2532a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipreqs \
python3.11dist-pipreqs \
python311-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
python311-setuptools \
python311-yarg \
update-alternatives"

inherit rpm
