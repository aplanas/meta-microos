SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-tenant-7.0.0-2.1.noarch.rpm"
RPM_HASH = "91f2e1e51f3154054044998e066c7be5a72d290b25b86059d2be31479de245c46aeaca623d0b82d3d6a39d7fbf9f218ab6d9a9c322bac5674ba7de2fb0f43ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "keylime-config \
keylime-tpm_cert_store \
python3-keylime"

inherit rpm
