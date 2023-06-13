SUMMARY = "openSUSE branding for SDDM, a QML-based display manager"
DESCRIPTION = "SDDM is a display manager for X11. It uses technologies like QtQuick, \
which in turn gives the designer the ability to create animated user \
interfaces. \
This package provides the openSUSE branding for SDDM."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.0"

RPM_NAME = "sddm-branding-openSUSE-0.19.0-11.1.aarch64.rpm"
RPM_HASH = "08380fea16feff1db848a1252c2fb55bff74b70fb1689d5eb2673683464cb64a88d0707c4644c06e293a5648dbf7efdf7da32cc0b0c9f0f59be6f5f6ed77493b"

RPROVIDES:${PN} += "sddm-branding \
sddm-branding-openSUSE \
sddm-branding-openSUSE(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
diffutils \
sddm \
sddm-theme-openSUSE"

inherit rpm
