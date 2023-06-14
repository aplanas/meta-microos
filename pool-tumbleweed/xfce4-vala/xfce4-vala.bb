SUMMARY = "Vala Bindings to Xfce Libraries"
DESCRIPTION = "This package provides Vala bindings to Xfce Libraries."
LICENSE = "LGPL-2.1+"

PV = "4.10.3"

RPM_NAME = "xfce4-vala-4.10.3-17.10.noarch.rpm"
RPM_HASH = "cc33afb4740fd338dba0c2bed76326418958893e3e321031d0ba71f55b3c49ac1f9b642e98e253f64ad4b4ed978896f20f690e1fb3aa9996bf80ca6acc34040a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xfce4-vala \
xfce4-vala"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vala"

inherit rpm
