SUMMARY = "Monodoc documentation for gtk-sharp2"
DESCRIPTION = "This package contains the gtk-sharp2 documentation for monodoc."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-doc-2.12.45-3.9.aarch64.rpm"
RPM_HASH = "68780483ae2aaa37a60360cf6a0f56900789e9d21ef9c912e57511e6d141184fd49fb51bd0882d2ed56623c17d3fdf435737af73539d299b1162a340b3d3a29a"

RPROVIDES:${PN} += "gtk-sharp2-doc"

RDEPENDS:${PN} += ""

inherit rpm
