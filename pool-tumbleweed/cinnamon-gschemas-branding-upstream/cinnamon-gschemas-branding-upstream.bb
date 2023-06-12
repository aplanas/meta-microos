SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.7"

RPM_NAME = "cinnamon-gschemas-branding-upstream-5.2.7-2.7.noarch.rpm"
RPM_HASH = "ef6868263ecae90d002441d0b284071fe8aef4b979f454dd263f869bebc895af3485aa1c04492dfa7d70d2a6ad95ee13c71b70eeda6a94b3bb3430723efb87a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-upstream \
cinnamon-gschemas-branding \
cinnamon-gschemas-branding-upstream"
RDEPENDS:${PN} += "cinnamon-gschemas"

inherit rpm
