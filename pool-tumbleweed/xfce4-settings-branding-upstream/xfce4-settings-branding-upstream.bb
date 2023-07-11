SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-settings."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-settings-branding-upstream-4.18.3-1.1.noarch.rpm"
RPM_HASH = "523177ae530ba6dca910ff3ffd155bf551d356eb3fa015f1ef91c4236e654db3e72002afad4f4d5f35fd76c558cbcd481809f43aaa14952c166c9a738aa26335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-settings-branding-upstream \
xfce4-settings-branding \
xfce4-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
