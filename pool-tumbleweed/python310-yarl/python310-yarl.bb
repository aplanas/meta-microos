SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python310-yarl-1.9.2-2.1.aarch64.rpm"
RPM_HASH = "c02b591b6ad29b452ab0161c98143bbbd5d84814187ce73e04f913d7168fcbf4e34fac7404b77eb411a5dd2322a01f34d01188ba8d30fe1490a8ea9958084d15"

RPROVIDES:${PN} += "python3.10dist-yarl \
python310-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-idna \
python310-multidict"

inherit rpm
