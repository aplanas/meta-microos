SUMMARY = "Common files for GNOME Shell extensions"
DESCRIPTION = "This package provides files common to several GNOME Shell Extensions"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-extensions-common-44.0-1.1.noarch.rpm"
RPM_HASH = "fb4dca08a94160c8a5129adb2d9e21c932b2aa49467ea6de7656e26b3f5b480c48e9cc9161bae125f77d38835b6ab2a455038d369bcd81d156f555e70fbcfd81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extensions-common"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
