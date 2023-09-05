SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-firewalld-7.5.0-1.1.noarch.rpm"
RPM_HASH = "97d2f1abb01b82c9fe73c54a12be275ed286565a3faba21964d408f86cb1f8a5f3bab38df7ac6d667d750ab615ecd0439e1733321df0c473513da353a36f6c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime"

inherit rpm
