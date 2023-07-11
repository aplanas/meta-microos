SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.7"

RPM_NAME = "cinnamon-gschemas-branding-upstream-5.2.7-2.8.noarch.rpm"
RPM_HASH = "a25688e4126da26777b67a3545f4478108a7c9ec0792e7e7753bbbdaffd7741ae516c211abc0def388bc17db25ba42442290db11da040ce2ec9e78d7e3a88112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-upstream \
cinnamon-gschemas-branding \
cinnamon-gschemas-branding-upstream"

RDEPENDS:${PN} += "cinnamon-gschemas"

inherit rpm
