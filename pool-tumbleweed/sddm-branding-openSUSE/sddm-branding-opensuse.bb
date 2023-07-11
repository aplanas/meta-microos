SUMMARY = "openSUSE branding for SDDM"
DESCRIPTION = "This package provides the openSUSE branding for SDDM."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.0"

RPM_NAME = "sddm-branding-openSUSE-0.20.0-2.1.aarch64.rpm"
RPM_HASH = "01372ce9e3868f77db77191c1334d4fc81f249265956cab5c507c9de122363117f5e4d0d78539b7711d35fc1199a84254b11bfbc35a8041f85a30e603457712f"

RPROVIDES:${PN} += "sddm-branding \
sddm-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
kwin5 \
sddm \
sddm-theme-openSUSE"

inherit rpm
