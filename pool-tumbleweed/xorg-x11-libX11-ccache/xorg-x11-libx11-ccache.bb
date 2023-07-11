SUMMARY = "X"
DESCRIPTION = "Cache for X.Org compose files."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "xorg-x11-libX11-ccache-7.6-22.7.aarch64.rpm"
RPM_HASH = "cad82931e6cb55346d5e1b27b5e6fa5bacc12cee781460826213dd1a007071b4fb4839c32b27fcc299808b513b3951a1736525b4bfe3834955ba2169ab723bac"

RPROVIDES:${PN} += "xorg-x11-/var/X11R6/compose-cache/ \
xorg-x11-libX11-ccache"

RDEPENDS:${PN} += ""

inherit rpm
