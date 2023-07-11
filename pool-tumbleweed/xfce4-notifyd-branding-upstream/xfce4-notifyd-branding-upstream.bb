SUMMARY = "Upstream Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Notification Daemon."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "xfce4-notifyd-branding-upstream-0.8.2-1.4.noarch.rpm"
RPM_HASH = "7d0bf969e14875efbb6fa5c9406b0dd2029e3318036b9ef96566d5e9a66f38ffaafb836535031fa42378ddc4e316a4c48ab0670da4773bdca1300e85cf8b764b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-notifyd-branding-upstream \
xfce4-notifyd-branding \
xfce4-notifyd-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
