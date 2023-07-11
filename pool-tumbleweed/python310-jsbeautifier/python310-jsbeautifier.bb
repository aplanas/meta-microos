SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python310-jsbeautifier-1.14.7-1.6.noarch.rpm"
RPM_HASH = "afa284adb75c23bd993755d5766ff7f74862dec59f8f7147a4c77a5562779cc1b274f9d08a4f9b87d57f09a63b6a5663569ba2aec7e78d8b1947026efc419049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsbeautifier \
python310-jsbeautifier \
python3dist-jsbeautifier"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-EditorConfig \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
