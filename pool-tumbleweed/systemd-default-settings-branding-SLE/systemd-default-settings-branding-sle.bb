SUMMARY = "Specific customization of systemd defaults settings for SLE"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-SLE-0.7-2.6.noarch.rpm"
RPM_HASH = "5a112b792e610e2ed29e797e014b459118c2f0552d8c32d0000dab5cf2afb707a7d2b801a9353a4a41b1ca05509ebf00891d07f26ce48cea873da11c285b0ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-SLE"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
