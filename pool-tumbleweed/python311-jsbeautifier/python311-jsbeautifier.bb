SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python311-jsbeautifier-1.14.7-1.4.noarch.rpm"
RPM_HASH = "2392e67537c6599ee1b720679318482a18277279bc69ad7560fbc2bd67d37a9e785b567be8543e5eb33b8c1a2d82ab6dbb42e43edb2e1a79bf5141db8057258f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsbeautifier) \
python311-jsbeautifier \
python3dist(jsbeautifier)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-EditorConfig \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
