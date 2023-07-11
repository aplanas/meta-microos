SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nemo file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nemo-extension-nextcloud-3.9.0-3.1.noarch.rpm"
RPM_HASH = "ef3681d753466bcf48aee9e4ffcc880dba4c46c542c4117ad0ea583aac1de2531d207a5d03c37e26711216ca7ae2ab27c6df9041f1d4ef23010af2401b939986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-nextcloud"

RDEPENDS:${PN} += "nemo \
nextcloud-desktop \
python-nemo \
typelib-GObject \
typelib-Nemo"

inherit rpm
