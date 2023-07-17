SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.13"

RPM_NAME = "python310-pipreqs-0.4.13-1.1.noarch.rpm"
RPM_HASH = "32b179ea543af6582e5f8c03264953042a30bd0b89693fc31eba49185765e59cb121ec2e13bd615c04df348237881074be87aebbe4fc58fd03a73e71f1a2a99a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pipreqs \
python310-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docopt \
python310-yarg \
update-alternatives"

inherit rpm
