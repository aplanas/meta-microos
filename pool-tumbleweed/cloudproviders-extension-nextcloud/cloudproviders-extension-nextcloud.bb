SUMMARY = "Libcloudproviders integration for nextcloud-desktop"
DESCRIPTION = "This package provides libcloudproviders integration for the \
nextcloud desktop client."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "cloudproviders-extension-nextcloud-3.9.0-3.1.noarch.rpm"
RPM_HASH = "9c3f2a323ee4d2a616bf9d21ee7f291a3cd54ef6d5e5ec9abae590476a3cfa7a092eb403c74507a3183923271d59da42fa93b85f273f9b4fe3e0ac72ff7d7cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloudproviders-extension-nextcloud"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
