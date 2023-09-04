SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-verifier-7.4.0-1.1.noarch.rpm"
RPM_HASH = "6d05e3026b68f147ca5c69523e9afbcf3590d6c4b2ee2c4af96bd9aeb003850ad41c366bee7716e1d517ab671992b513dbabb8d5e17ad13cc9b76bc8b82dfeef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
