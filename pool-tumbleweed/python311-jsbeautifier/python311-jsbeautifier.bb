SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python311-jsbeautifier-1.14.7-1.6.noarch.rpm"
RPM_HASH = "92fe17d370466a8a922392351143a7939826fdc55632cc718eb8f1af172c4f697a90b8f3be075ddc4755518114f3e71e8541b7563c49e69f3401b34c5708bbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsbeautifier \
python3.11dist-jsbeautifier \
python311-jsbeautifier \
python3dist-jsbeautifier"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-EditorConfig \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
