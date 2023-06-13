SUMMARY = "Translation Updates for Dutch"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-nl-15.1-3.1.noarch.rpm"
RPM_HASH = "9a401e3efbbf825463ba08c80ebfdf60e462ad64722c486585e3d3e82925deabbf825362c1f7518fdf2c35e6058a32f051befd9f34c32ced6607c8eb6c661abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:nl) \
translation-update-nl"

RDEPENDS:${PN} += "translation-update"

inherit rpm
