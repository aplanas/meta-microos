SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "gio-branding-upstream-2.76.4-1.1.noarch.rpm"
RPM_HASH = "0566e1738987b2a3eaf42bc12922f8301be270757275b3707df16cd22516e5e665fd894246f010306f85b98b3219a1d234e989e36bbf3677b0bf3db02cf86bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-upstream \
gio-branding \
gio-branding-upstream \
glib2-branding-upstream"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
