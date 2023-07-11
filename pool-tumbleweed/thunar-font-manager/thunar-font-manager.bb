SUMMARY = "Thunar extension for Font Manager"
DESCRIPTION = "This package provides integration with the Thunar file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "thunar-font-manager-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "50508bf5169498fd5cb7e7071c09a2cda3cc53039178d809c3a32bbfd39826dc6b7a770cc79ccd3022ca2831df98814a66b986e3aa01bcd3ad3be9cb2f776f19"

RPROVIDES:${PN} += "thunar-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libthunarx-3.so.0"

inherit rpm
