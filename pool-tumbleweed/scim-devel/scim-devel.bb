SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-devel-1.4.18-5.11.aarch64.rpm"
RPM_HASH = "e123e9c8570df1c7a95006e6fe37b286aee3392976db64cef9941aae585ae485ab41f533633acefe209d64c1e7f7fd2341f2b693bf57cef6887a326e78a20de1"

RPROVIDES:${PN} += "pkgconfig-scim \
pkgconfig-scim-gtkutils \
pkgconfig-scim-x11utils \
scim-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gtk+-3.0 \
pkgconfig-scim \
scim"

inherit rpm
