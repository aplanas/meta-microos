SUMMARY = "Configuration file for Cloud node initialization tool"
DESCRIPTION = "This package contains the product specific configuration file \
for cloud-init."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-config-suse-23.1-2.1.aarch64.rpm"
RPM_HASH = "875d5c1ff07c7918ca872cdf56df705f14544b6b0f579919bfae965fc869ab909f365082e35d47d11600d74726b2bdbf44165a885c5ed172c9a5462b5d149af6"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-suse \
config-cloud-init-config-suse"

RDEPENDS:${PN} += ""

inherit rpm
