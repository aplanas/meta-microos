SUMMARY = "Libcloudproviders integration for nextcloud-desktop"
DESCRIPTION = "This package provides libcloudproviders integration for the \
nextcloud desktop client."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "cloudproviders-extension-nextcloud-3.9.3-1.1.noarch.rpm"
RPM_HASH = "5d607aa848e1b63deeac129025f5f735315c0627f4f1d528241979e329837e060525b5a33f88b995527e3c65687c2fef3d102ff52350897a24b2b74e3e08cac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloudproviders-extension-nextcloud"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
