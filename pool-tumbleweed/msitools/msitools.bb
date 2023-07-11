SUMMARY = "Tools to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files. \
 \
msitools plans to be a solution for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.102"

RPM_NAME = "msitools-0.102-1.1.aarch64.rpm"
RPM_HASH = "279c041c6e860bae119d8453012caa8bd4ec2d8f6741a9035a3219f79bd81d007da8352fb052fd5ea5f51967f8debb0cab0eaa9cbe985c0a94abe6c9a0d2aff5"

RPROVIDES:${PN} += "msitools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmsi.so.0 \
libxml2.so.2"

inherit rpm
