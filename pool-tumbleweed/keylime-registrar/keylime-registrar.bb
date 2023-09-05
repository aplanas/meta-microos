SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-registrar-7.5.0-1.1.noarch.rpm"
RPM_HASH = "d262cbedd9bd5bade6cc2ad73e8812655812750965f9869d97f2d396106e43700f2f516585932509980bfeecdf5f8c9e30a1c4102786ba13c226fb3f23fa5581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
