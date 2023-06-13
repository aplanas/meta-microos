SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-settings."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-branding-upstream-4.18.2-1.3.noarch.rpm"
RPM_HASH = "e608df87d7bc6166ab469b805a83fbae99934c8aba5eea5c359640b8de3b43c581ffe307d0c7466458b1d1028b90269944933a7cbbbd8fc5d42e02bd4b30b298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-settings-branding-upstream) \
xfce4-settings-branding \
xfce4-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
