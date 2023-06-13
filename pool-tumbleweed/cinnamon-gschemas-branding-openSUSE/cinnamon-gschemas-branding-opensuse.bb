SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "cinnamon-gschemas-branding-openSUSE-42.2-5.18.noarch.rpm"
RPM_HASH = "580686a747dd08e78412eaf567b6265e02c8bcf402620d60f7bec8359e52d23f00a04e566540ad77776954c0301d800544dfb71904b8c69d279fadb030342faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-openSUSE \
cinnamon-gschemas-branding \
cinnamon-gschemas-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
cinnamon-gschemas \
cinnamon-themes \
libgnomesu"

inherit rpm
