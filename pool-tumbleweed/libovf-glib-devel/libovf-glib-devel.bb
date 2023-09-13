SUMMARY = "Development Files for gtk-frdp, a virtual machine image library"
DESCRIPTION = "Libgovf is a library for reading and writing virtual machine images \
in the Open Virtualization Format. \
 \
This package provides all the necessary files for development with \
libovf-glib."
LICENSE = "GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "libovf-glib-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "aa1e3e37bda4328df60b34a5b9089767ce35f1cd2f3673bd45e1f907eb02b913c0e1bd781e7b7a280ca96decab1a4772e5a43e9428f78dc391afc9735d55b1bc"

RPROVIDES:${PN} += "libovf-glib-devel"

RDEPENDS:${PN} += "gnome-boxes"

inherit rpm
