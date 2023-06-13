SUMMARY = "A Pidgin plugin to connect to Mattermost"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. \
It connects libpurple-based instant messaging clients with the \
Mattermost server. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "pidgin-plugin-mattermost-2.1-1.4.noarch.rpm"
RPM_HASH = "f23882d138061fbce1a07f577aafd66d8f6e86d8ff8a59c91be5109db552796f932870fc819cc0ece63e847fa1da175b67187e3d651f3e125907d0d726994911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-mattermost"

RDEPENDS:${PN} += "libpurple-plugin-mattermost"

inherit rpm
