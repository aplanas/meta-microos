SUMMARY = "Systemd default presets for openSUSE"
DESCRIPTION = "Default presets for systemd on openSUSE distribution. \
 \
These are the openSUSE specific presets. The default \
presets needed for all SUSE based distributions can be \
found in systemd-presets-common-SUSE."
LICENSE = "GPL-2.0-or-later"

PV = "12.2"

RPM_NAME = "systemd-presets-branding-openSUSE-12.2-23.1.noarch.rpm"
RPM_HASH = "23f2acd0d2aa43f7a6e15590a928f311325b58c411e378d0484a12fc2a53aabd95a456bc88b8b0a640290a85a6012776708840c0b7f210ef10188b97d500a6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
