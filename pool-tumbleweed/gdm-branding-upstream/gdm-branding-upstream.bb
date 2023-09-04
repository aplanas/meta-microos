SUMMARY = "The GNOME Display Manager -- Upstream default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the upstream default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-branding-upstream-44.1-3.1.noarch.rpm"
RPM_HASH = "17f4a29ece5a941299ac57c40de26675732e8dfc1bd8c02e0712f45cefa1d4c405c27ff0d1732280acbae9b34e223608b8c5b04c184fa70a28760c021aac34b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gdm-branding-upstream \
gdm-branding \
gdm-branding-upstream"

RDEPENDS:${PN} += "gdm"

inherit rpm
