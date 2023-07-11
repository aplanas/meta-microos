SUMMARY = "Python bindings for gedit"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME \
environment. \
 \
This package provides the python bindings, based on gobject-introspection."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "python3-gedit-44.2-1.5.noarch.rpm"
RPM_HASH = "f4f950cfd13ea12bc82d0516b090d964b5b54ca750e2ad1d6ab3f0a848674f42a28b27d4425e3a8b43519157f82573322765a5c025a863183405255675a1d538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gedit"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm
