SUMMARY = "Translation Updates for Bulgarian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-bg-15.1-3.1.noarch.rpm"
RPM_HASH = "562ac124ebbab8b7774eed204f4bddac92cc2f3605e2c01f98a77d8a2f0bd02949e3ec981c08101b8ce3d1ce13c33e974ca37917a6e063e950130d251688d3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-bg \
translation-update-bg"

RDEPENDS:${PN} += "translation-update"

inherit rpm
