SUMMARY = "Specific customization of systemd defaults settings for openSUSE"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for openSUSE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-openSUSE-0.7-2.6.noarch.rpm"
RPM_HASH = "d05cb5e462b3c5458ef1a96c6ba6a1f4df0a817fef67f6968e5baa8ab6fe392522bb08f0f27c7ae189c08c878e8e72d7fe3ca48a96474efb9ceec9e139b72328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-openSUSE"
RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
