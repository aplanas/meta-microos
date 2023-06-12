SUMMARY = "Libcloudproviders integration for nextcloud-desktop"
DESCRIPTION = "This package provides libcloudproviders integration for the \
nextcloud desktop client."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "cloudproviders-extension-nextcloud-3.8.2-1.1.noarch.rpm"
RPM_HASH = "c2c93359bf695373027f5a29744f67996830539600027ffe84e7e8d938ce98c5833813cc549397d8974581ca6d882ca1505d3ce3bca243b20aba81ed061c8d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloudproviders-extension-nextcloud"
RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
