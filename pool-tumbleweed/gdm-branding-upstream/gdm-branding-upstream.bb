SUMMARY = "The GNOME Display Manager -- Upstream default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the upstream default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-branding-upstream-44.1-2.1.noarch.rpm"
RPM_HASH = "ef2a5febc378995946683a02f2832085f33a0c77820bdf26062ce9a75b7bf58015b863de97d2178de0e64fbc7ec831d72d356114591809ea79f16ad6b474c2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-upstream \
gdm-branding \
gdm-branding-upstream"

RDEPENDS:${PN} += "gdm"

inherit rpm
