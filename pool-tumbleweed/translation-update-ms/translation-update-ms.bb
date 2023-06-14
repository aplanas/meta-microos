SUMMARY = "Translation Updates for Malay"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ms-15.1-3.1.noarch.rpm"
RPM_HASH = "5b8e49479af57c4522b3f16eeb366267e07ef6dc208169f8f82f12062a3819038bc73b696797db5d29886f4e8ce4cb7eba822b89394c2d7341a657241df36bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-ms \
translation-update-ms"

RDEPENDS:${PN} += "translation-update"

inherit rpm
