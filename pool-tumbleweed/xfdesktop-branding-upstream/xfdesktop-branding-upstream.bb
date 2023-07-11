SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Desktop Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-branding-upstream-4.18.1-1.4.noarch.rpm"
RPM_HASH = "8f1215ac94c8f435207909908e7082f8d64400d552fb0922dbcd9a0f28b6eacb3cbf026fd60f0b022db9b9e6022fda9a5817fc6a5914ccdb01c0ebbb49a38e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-desktop-branding-upstream \
xfdesktop-branding \
xfdesktop-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
