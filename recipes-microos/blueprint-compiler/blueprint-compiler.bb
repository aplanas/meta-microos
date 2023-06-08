SUMMARY = "A markup language for GTK user interfaces"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blueprint-compiler-0.6.0-1.1.noarch.rpm"
RPM_HASH = "00bd03818b6bd207142af126afbf29e06c196808d5800f929c0e13342f028beacd2cbe04f0624210e694a60198d9e8c103c1a4d2157b8bc40eaf2008ba65079d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler"
RDEPENDS:${PN} += "/usr/bin/python3 gobject-introspection-devel gtk4-devel libadwaita-devel python(abi) python3-gobject typelib(GIRepository)"

inherit rpm
