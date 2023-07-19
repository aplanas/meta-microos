SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-registrar-7.3.0-1.1.noarch.rpm"
RPM_HASH = "98dbb89542deb9fda7ee3a8662a238b5394b95fae912d5b97da57204de39fdd67ff16f83ab70c8ef61a89c6a5bff596b8a4372f0be451018850b7cac7dd4f7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
