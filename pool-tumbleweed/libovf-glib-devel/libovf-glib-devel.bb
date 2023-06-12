SUMMARY = "Development Files for gtk-frdp, a virtual machine image library"
DESCRIPTION = "Libgovf is a library for reading and writing virtual machine images \
in the Open Virtualization Format. \
 \
This package provides all the necessary files for development with \
libovf-glib."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "libovf-glib-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "a758b25678627c2bdd444a5a30d93c86bb9c80dfe51732b410263c1992bd566f620ab3509d1ec9b81806474d2cef560387226f0f7435bfd5597ad043c213d792"

RPROVIDES:${PN} += "libovf-glib-devel \
libovf-glib-devel(aarch-64)"
RDEPENDS:${PN} += "gnome-boxes"

inherit rpm
