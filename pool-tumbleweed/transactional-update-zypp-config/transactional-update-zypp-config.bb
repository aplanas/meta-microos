SUMMARY = "Zypper rule to prevent uninstallation of transactional-update"
DESCRIPTION = "Adds a zypper rule to prevent accidental uninstallation of \
transactional-update."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "transactional-update-zypp-config-4.3.0-1.1.noarch.rpm"
RPM_HASH = "3eaa7e11cbf640f125ba8299cb9dfe2ddc7c52bcf3e74d3ae20b7545d8ff98294aba9545825d7baacaeadbb5f077777c52fa5691bf79aa84378ddfa2caf80c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-transactional-update-zypp-config \
transactional-update-zypp-config"

RDEPENDS:${PN} += "transactional-update"

inherit rpm
