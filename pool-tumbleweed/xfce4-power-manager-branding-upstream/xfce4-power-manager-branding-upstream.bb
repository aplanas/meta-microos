SUMMARY = "Upstream Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-power-manager-branding-upstream-4.18.2-1.1.noarch.rpm"
RPM_HASH = "7be33d111dbbbc2a6fa20ce176399b160a8e8249e4aee1f43ac41bcf1d0eb10c46863fb31fee8d749b956b0edb74ed4916f762f1a86931bb1d1b58fb26d3aeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-power-manager-branding-upstream \
xfce4-power-manager-branding \
xfce4-power-manager-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
