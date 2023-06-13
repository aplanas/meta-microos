SUMMARY = "Dracula GNOME Shell themes"
DESCRIPTION = "This package contains the GNOME Shell support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "gnome-shell-theme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "2b2caa5a4875234865116046f39cf0ca7643ca917d2fd4a3f7f9a216e00cd490f392531a1b02bb538d40bf017ee245d58dd7215e9cf87fc60b8499841840933e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gnome-shell-theme-dracula"

RDEPENDS:${PN} += "gnome-shell \
metatheme-dracula-common"

inherit rpm
