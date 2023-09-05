SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-tpm_cert_store-7.5.0-1.1.noarch.rpm"
RPM_HASH = "e04780be75cc14d37fbd10a0148ccbe95956f44f0b17a963e4c9c5d401dacea0851eb9437ef26a5be3f2323100146cc4e3a7f9586902e018ac5abfaabf953458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-keylime \
keylime-tpm-cert-store \
user-keylime"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime \
sysuser-shadow"

inherit rpm
