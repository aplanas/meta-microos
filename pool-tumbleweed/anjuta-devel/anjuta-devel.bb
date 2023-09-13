SUMMARY = "Development files for Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "anjuta-devel-3.34.0-5.8.aarch64.rpm"
RPM_HASH = "fb6dc61f14d460d5feb68f8cf8be4a89975bc045f504bbc182fab7857c7925ec0957bfb086b3ecbc44bb90e7bacdb2e8cdddce7e11e7c3e00a7f7004f73aeb64"

RPROVIDES:${PN} += "anjuta-devel \
anjuta-doc \
pkgconfig-libanjuta-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanjuta-3-0 \
pkgconfig-gdl-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Anjuta-3-0"

inherit rpm
