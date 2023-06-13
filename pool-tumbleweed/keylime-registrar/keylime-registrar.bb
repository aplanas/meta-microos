SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-registrar-7.0.0-2.1.noarch.rpm"
RPM_HASH = "aa558cba58add5040c76c283a0ad3dba5c71cc2e6a43fc4399cd617f6485f2f6f2a5697ad8b847681ae265b1a6b780ffe8e4c913acad433d0df30a185325f217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm_cert_store \
python3-keylime"

inherit rpm
