SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-versioningit-2.2.0-1.5.noarch.rpm"
RPM_HASH = "e03eeb22944d28055818617cedc8161b4bd22765b7f429f4c89e89e844a50f2aea3461f18b4fd390f01e79202386bde7c07c566333de20294b70def807a50eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioningit \
python3.11dist-versioningit \
python311-versioningit \
python3dist-versioningit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-packaging \
python311-setuptools \
python311-tomli"

inherit rpm
