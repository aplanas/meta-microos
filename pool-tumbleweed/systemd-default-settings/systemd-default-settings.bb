SUMMARY = "Customization of systemd default settings for SUSE distributions"
DESCRIPTION = "This package overrides some of the upstream default settings which are \
better suited for openSUSE or SLE distributions. \
 \
This package should not be installed alone but is supposed to be \
pulled in by the branding package instead."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-0.7-2.7.noarch.rpm"
RPM_HASH = "5baa07b3e2419d5d0fc4c229e6b42d98289d99e5b322fca6b5cb0f2648017479d7dfe2c048aebaa4e4c409f436b660dff668df5810d23bbe4984d56c84c0ebb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd-default-settings-branding"

inherit rpm
