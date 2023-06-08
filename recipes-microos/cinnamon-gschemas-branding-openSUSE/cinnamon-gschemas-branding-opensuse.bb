SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "cinnamon-gschemas-branding-openSUSE-42.2-5.17.noarch.rpm"
RPM_HASH = "8fdaf10d45c9feacdd97c07a8b2994b600e930d4648145c999510981ad6c9df62aaac261f06a00e77a25d6d10320fea0e5f6393ffb2efe88a63e83d41ca186e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-openSUSE cinnamon-gschemas-branding cinnamon-gschemas-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh cinnamon-gschemas cinnamon-themes libgnomesu"

inherit rpm
