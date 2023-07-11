SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nautilus file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "owncloud-client-nautilus-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "4b5105d35a2825bdc4a8e14a9eedd168297026e05617a9a8fa3f0704f60ee45226c727fd238641f32708caac7961cce33576324820d9328ac48c774c96304dc3"

RPROVIDES:${PN} += "owncloud-client-nautilus"

RDEPENDS:${PN} += "nautilus \
owncloud-client \
python3-nautilus"

inherit rpm
