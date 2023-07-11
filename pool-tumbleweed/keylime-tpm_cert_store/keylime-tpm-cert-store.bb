SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-tpm_cert_store-7.2.5-1.3.noarch.rpm"
RPM_HASH = "f9b6b852fcca33841c0175de5157e1bd9c3eddc48a0210f9380d884f387c9f9c5e25302f36a1d3b90b3d0cbda3260bd7b2bb69948f19adbbcc6211f0f4ed19b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime \
sysuser-shadow"

inherit rpm
