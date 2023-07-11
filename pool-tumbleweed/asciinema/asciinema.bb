SUMMARY = "Terminal session recorder"
DESCRIPTION = "Record of terminal sessions and sharing them on the web."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "asciinema-2.2.0-1.3.noarch.rpm"
RPM_HASH = "29f9713ce0c12ccad0be9fa06712f2dd58a1dd33813f521d40d770710d91231291300f6edcd2a07dc2def6928b7301f4749f8e0ccdd55f984b94e6c86b734a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciinema \
python3.11dist-asciinema \
python3dist-asciinema"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi"

inherit rpm
