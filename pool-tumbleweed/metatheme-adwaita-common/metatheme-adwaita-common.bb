SUMMARY = "Common files for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "metatheme-adwaita-common-3.28-1.20.noarch.rpm"
RPM_HASH = "d7fe4c4606d9cbc0cb5053aea7fe6e363455fcd5ddfb9d4d24e4be9cfe2d94b22ffd2126e6631448f5ec9caa25b5fb6b78f209f05f529e4165a887c04394f1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-adwaita-common"

RDEPENDS:${PN} += ""

inherit rpm
