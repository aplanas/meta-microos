SUMMARY = "Libcloudproviders integration for nextcloud-desktop"
DESCRIPTION = "This package provides libcloudproviders integration for the \
nextcloud desktop client."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "cloudproviders-extension-nextcloud-3.8.1-1.1.noarch.rpm"
RPM_HASH = "59606f721d4face2042f2e76d2bb205470d66d13957fd7c4f03a68049286d34607d7fe891a854b696cda0ec42bcc3b73cbd98f9d643a5d0d4dc4b6cab03def45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloudproviders-extension-nextcloud"
RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
