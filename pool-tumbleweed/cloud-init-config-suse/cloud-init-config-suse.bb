SUMMARY = "Configuration file for Cloud node initialization tool"
DESCRIPTION = "This package contains the product specific configuration file \
for cloud-init."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-config-suse-23.1-1.4.aarch64.rpm"
RPM_HASH = "8fc1f0e5c83a1d8effb86dd7f8e4b74f3e4746305c6cda932d6f04f0a694261c3ea70b01d09bf22ec99474431940b033733424d9405e672c0315977b03e43eab"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-suse \
config-cloud-init-config-suse"

RDEPENDS:${PN} += ""

inherit rpm
