SUMMARY = "Development Files for gtk-frdp, a virtual machine image library"
DESCRIPTION = "Libgovf is a library for reading and writing virtual machine images \
in the Open Virtualization Format. \
 \
This package provides all the necessary files for development with \
libovf-glib."
LICENSE = "GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "libovf-glib-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "c0fff77515ba73765317e3ca2c1123d34692ac472a86f04f68d1e7c4849d30b8b63ee27675db7734610ded562fb88ede774b47540a7439121e45af25850d9d3b"

RPROVIDES:${PN} += "libovf-glib-devel"

RDEPENDS:${PN} += "gnome-boxes"

inherit rpm
