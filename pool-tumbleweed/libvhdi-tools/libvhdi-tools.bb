SUMMARY = "Tools to access the VHD image format"
DESCRIPTION = "Tools to access the Virtual Hard Disk (VHD) image format.  See libvhdi for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-tools-20221124-3.7.aarch64.rpm"
RPM_HASH = "7e672cb2389ac11760ee616cbc4898a0d0c99cad8f056e2e184f2ba63a971c385206573e712ffa47bc1d4e54ef32fab3991a1c41b353450b6389dda96d305eee"

RPROVIDES:${PN} += "libvhdi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfguid.so.1 \
libvhdi.so.1"

inherit rpm
