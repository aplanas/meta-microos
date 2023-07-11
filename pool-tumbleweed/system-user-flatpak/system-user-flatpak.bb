SUMMARY = "System user for the flatpak system helper"
DESCRIPTION = "System user for the flatpak system helper."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "system-user-flatpak-1.14.4-1.3.noarch.rpm"
RPM_HASH = "006315523deaa28fa1776147163d8ede56a47141b55482e4ea3ce096eb42cd8930ab4622d2e1f6daac7a0bb5fe9063bd56a0d97c33b2d74d1304ae63c7ede174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-flatpak \
system-user-flatpak \
user-flatpak"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
