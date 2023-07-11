SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python39-jsbeautifier-1.14.7-1.6.noarch.rpm"
RPM_HASH = "1b8f83cd1ee8b9e93a35caddbfb92dc3e0fa08aa2bcdf85b2a5813efb9d320413e9d0bd8eb1a0aa40ce95a3e29b27fd46b08ba7e33f6df750ff1d56cee1e6b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsbeautifier \
python39-jsbeautifier \
python3dist-jsbeautifier"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-EditorConfig \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
