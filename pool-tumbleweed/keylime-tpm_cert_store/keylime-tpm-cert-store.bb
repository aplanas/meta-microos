SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-tpm_cert_store-7.4.0-1.1.noarch.rpm"
RPM_HASH = "da5e996153cdc1765f850df583ef6faba4eb6a0f0fe103e6f21d88a2958260bfede69ce06895c9229014019892c75e62315b52a818bfde22e289872b816499cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime \
sysuser-shadow"

inherit rpm
