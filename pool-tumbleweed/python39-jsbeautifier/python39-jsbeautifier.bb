SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python39-jsbeautifier-1.14.7-1.4.noarch.rpm"
RPM_HASH = "0b9b4126633c6618d87108f04097077861f9327f7f7d0cd5b70299a24cbd2530b3a6274a64906556e2f5828e750a90bd5bdb7a9aef9b57200734071162f224a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsbeautifier) \
python39-jsbeautifier \
python3dist(jsbeautifier)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-EditorConfig \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
