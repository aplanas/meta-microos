SUMMARY = "openSUSE Branding of xfce4-session"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Session Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-session-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "af50a1d1d7b31b90a43a90d60f4f2d424e00d63097f1c5e0f13c905928adf296e1ea3acdd52c25d02b23702e6d69e64dfc95e4f72843c3a84086c40962919e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-session-branding-openSUSE \
xfce4-session-branding \
xfce4-session-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-xfce-icon-theme \
desktop-file-utils \
gtk2-metatheme-greybird-geeko \
gtk3-metatheme-greybird-geeko \
libgio-2-0-0 \
metatheme-greybird-geeko-common \
thunar-volman"

inherit rpm
