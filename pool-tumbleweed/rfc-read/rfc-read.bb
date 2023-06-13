SUMMARY = "Read RFCs from the command-line"
DESCRIPTION = "A tool written in Bash to read RFCs from the command-line. It fetches RFCs and drafts from the Web and caches them locally."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "rfc-read-0.2.6-1.1.noarch.rpm"
RPM_HASH = "a606098bb71b549a95560dbceea9dbc07a1b56375f83ac4686d9cb8168d94e114bb1fdcc15b17490adb6a5e7424e21f6c3a0e2b8c861d1617874b6ed83f467e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rfc-read"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
less"

inherit rpm
