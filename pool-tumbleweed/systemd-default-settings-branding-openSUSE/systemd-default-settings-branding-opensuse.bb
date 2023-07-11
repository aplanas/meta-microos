SUMMARY = "Specific customization of systemd defaults settings for openSUSE"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for openSUSE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-openSUSE-0.7-2.7.noarch.rpm"
RPM_HASH = "5f9df5db559e8852c014e356c48645cd3fec8673e455810037e104738a130b9f734264c580395cd08a71ab7b06df17f22e41184f6cab9c12dbe445583231d4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-openSUSE"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
