SUMMARY = "A Pidgin plugin to connect to Mattermost"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. \
It connects libpurple-based instant messaging clients with the \
Mattermost server. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "pidgin-plugin-mattermost-2.1-1.5.noarch.rpm"
RPM_HASH = "1080f1d1fa61d4b822cb467e2f1c2d2d4da7e1f7d0e6cf8cd3ccef5d6dc470fdab0e35402612224c5d94903ed6fd94965c102a6b6e44de5b5618cb793d094c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-mattermost"

RDEPENDS:${PN} += "libpurple-plugin-mattermost"

inherit rpm
