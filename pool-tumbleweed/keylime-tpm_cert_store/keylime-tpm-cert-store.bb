SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-tpm_cert_store-7.0.0-2.1.noarch.rpm"
RPM_HASH = "5ee7719f7a461f9deea751c7da69732726ea26711452b67257ed9d89dbac5b788302119934045cc4dca40a46ab3636bf2bd8baaadd7915175e0a1376a9c00b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/bin/sh \
python3-keylime \
sysuser-shadow"

inherit rpm
