SUMMARY = "KDE support for the Dracula theme"
DESCRIPTION = "This package provides the KDE support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "kde-theme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "8c2ead7482bdba2c503ecb4e1c28780ab01a8dfea0f783aa07c7765dbf6d831b22f5dcbf7fc440f5e237eb94bf62307153c17f1d2457ca1dd043ad7fa329c594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
kde-theme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common \
plasma5-desktop"

inherit rpm
