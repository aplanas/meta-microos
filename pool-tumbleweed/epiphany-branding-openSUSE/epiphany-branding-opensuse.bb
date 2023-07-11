SUMMARY = "GNOME Web Browser -- openSUSE default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the openSUSE default bookmarks and user \
agent string."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "epiphany-branding-openSUSE-42.1-8.52.noarch.rpm"
RPM_HASH = "1f975bba3dd83472ec9adc09104cd6766e0e3af7bd6abd0b862adcb299acce9397ac0185bda8dad7e91cd4e17ccf27cf7c7d425d88c5c4ba406aa9c055b1900e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-openSUSE"

RDEPENDS:${PN} += "epiphany"

inherit rpm
