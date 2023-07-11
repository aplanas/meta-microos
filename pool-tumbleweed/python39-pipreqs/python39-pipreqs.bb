SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python39-pipreqs-0.4.10-3.3.noarch.rpm"
RPM_HASH = "0e79361d2ed29d21daabb3a8e6360368a95bcd219644edecd0fdb908d01663aebdc161e5d4857eabf836360efa66cbd798a6fa77da0377613085fce768e62b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipreqs \
python39-pipreqs \
python3dist-pipreqs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docopt \
python39-setuptools \
python39-yarg \
update-alternatives"

inherit rpm
