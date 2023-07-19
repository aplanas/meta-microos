SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-tpm_cert_store-7.3.0-1.1.noarch.rpm"
RPM_HASH = "312405b69cc377f32b1a56e84340420be090c37b10353b4ce3bba5103ca127eda092e91b9e2ff9a68a5d8eef9d82b157b6c4957a10a51a3dc32c124651184ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime \
sysuser-shadow"

inherit rpm
