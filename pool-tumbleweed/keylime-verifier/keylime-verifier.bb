SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-verifier-7.3.0-1.1.noarch.rpm"
RPM_HASH = "ceedecf85151ddb58f2665c71ffd3861a9a41a664ce63b523306b990585ca02b86cc9853dae429c2db815a3594e0e86e015272106d17d3a1ce0832b4cb54b839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
