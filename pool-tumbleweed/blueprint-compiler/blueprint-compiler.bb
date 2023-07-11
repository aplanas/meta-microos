SUMMARY = "A markup language for GTK user interfaces"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blueprint-compiler-0.6.0-1.2.noarch.rpm"
RPM_HASH = "48baa45032c3f28c61d03ec6ba7dd9427edb20974c89a8a214b581b9083b018749ddc97eba2ee23ddc0d19a5f02e8ae451c17c3e6f7724952587366b468c924a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler"

RDEPENDS:${PN} += "/usr/bin/python3 \
gobject-introspection-devel \
gtk4-devel \
libadwaita-devel \
python-abi \
python3-gobject \
typelib-GIRepository"

inherit rpm
