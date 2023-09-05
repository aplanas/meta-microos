SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-verifier-7.5.0-1.1.noarch.rpm"
RPM_HASH = "e661358b4c96ecc2e7324e496ecbce85218a04414a51c0087ebb9e3537fc403ba931fd2f1583d60298fb79f7e110a1c4835f39d3356c33b5be062dc4085d9a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
