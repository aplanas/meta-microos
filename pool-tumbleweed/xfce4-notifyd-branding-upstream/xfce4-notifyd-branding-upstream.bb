SUMMARY = "Upstream Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Notification Daemon."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "xfce4-notifyd-branding-upstream-0.8.2-1.3.noarch.rpm"
RPM_HASH = "9ecd525f55334d15f979f53cd17819eb1bcf6daa8059807943898ed160d7c88838349496bfa36a69b4cf8094fd5d8a952794387e6dd93882120f0c60148fb665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-notifyd-branding-upstream \
xfce4-notifyd-branding \
xfce4-notifyd-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
