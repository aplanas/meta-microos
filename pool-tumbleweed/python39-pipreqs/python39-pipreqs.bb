SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.13"

RPM_NAME = "python39-pipreqs-0.4.13-1.1.noarch.rpm"
RPM_HASH = "1490f39ed107fed286a1b3843e37f18f25caec16db6f4ac93084296781748579f5956cefed8fc3ac2719c86598ce2f1b16679ace83a2e2d7ab9d2b2156054fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipreqs \
python39-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docopt \
python39-yarg \
update-alternatives"

inherit rpm
