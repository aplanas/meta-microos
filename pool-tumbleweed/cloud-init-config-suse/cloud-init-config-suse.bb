SUMMARY = "Configuration file for Cloud node initialization tool"
DESCRIPTION = "This package contains the product specific configuration file \
for cloud-init."
LICENSE = "GPL-3.0-only"

PV = "23.1.2"

RPM_NAME = "cloud-init-config-suse-23.1.2-1.1.aarch64.rpm"
RPM_HASH = "1d2894a4649d3a0605b93a2920a34fb97651969a26643b8fae91d58cfb6ba28755f374960af5e3afd64b40116a8ff84c0d4a89b194cae1e67b4ebc4b5d4bb7f4"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-suse \
config-cloud-init-config-suse"

RDEPENDS:${PN} += ""

inherit rpm
