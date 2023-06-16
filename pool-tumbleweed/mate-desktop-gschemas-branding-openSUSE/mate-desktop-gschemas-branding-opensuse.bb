SUMMARY = "openSUSE Branding of mate-desktop"
DESCRIPTION = "This package provides the openSUSE definition for MATE Desktop GSchemas."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-desktop-gschemas-branding-openSUSE-42.1-5.5.noarch.rpm"
RPM_HASH = "52ba60f0c34adaa166a3c355e1c39ebf367aa32e2726bada53d8e9d8c9143ecfcd77a1dd26b2e9e13554539f3d32827a5fa4b00f9b191751ce4690ef7833a83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding \
mate-desktop-gschemas-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
adwaita-icon-theme \
mate-desktop-gschemas"

inherit rpm
