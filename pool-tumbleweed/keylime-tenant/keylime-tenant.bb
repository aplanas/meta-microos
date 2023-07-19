SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-tenant-7.3.0-1.1.noarch.rpm"
RPM_HASH = "3b64c75c56de8eab88db0788e797a689bf5fdaa0bebc2711f0220d1d5cc2a66b4a2de9adab20499b57ffd4df28e959de8473c0f3c7a6b58e4353a336ce595461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "keylime-config \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
