SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-branding-upstream-1.26.1-2.1.noarch.rpm"
RPM_HASH = "694bd92f56d2e18773cfbde02dff34109318b4816d210b3c1a1134256b3cc679d87272c74d6f99ef6fd832b5fc85b6b0f9084a2af01dc0362f892c22bc9a586d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-session-manager-branding-upstream \
mate-session-manager-branding \
mate-session-manager-branding-upstream"

RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
