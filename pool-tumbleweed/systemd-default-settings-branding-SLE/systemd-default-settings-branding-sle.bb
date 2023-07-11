SUMMARY = "Specific customization of systemd defaults settings for SLE"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-SLE-0.7-2.7.noarch.rpm"
RPM_HASH = "ea3199b10730b58ac27baba4fb37f5d38ec3eaaaa3ea70161d39793945941efc541b97efa244141b5317da697f5cfdb154eefe2bb05e04c73f4fadc94cdc07f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-SLE"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
