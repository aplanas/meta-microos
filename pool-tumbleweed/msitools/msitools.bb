SUMMARY = "Tools to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files. \
 \
msitools plans to be a solution for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.101"

RPM_NAME = "msitools-0.101-1.10.aarch64.rpm"
RPM_HASH = "22c6e25264c02afbbe628ad8824e46b65ee6f91b8507308608121f1adb2544f733d2518ad7c87d2f46b801b5e127954f92dfb54e69070a3e0ab8cabb0244ebfb"

RPROVIDES:${PN} += "msitools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmsi.so.0 \
libxml2.so.2"

inherit rpm
