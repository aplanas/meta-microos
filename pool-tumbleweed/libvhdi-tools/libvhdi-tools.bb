SUMMARY = "Tools to access the VHD image format"
DESCRIPTION = "Tools to access the Virtual Hard Disk (VHD) image format.  See libvhdi for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-tools-20221124-3.11.aarch64.rpm"
RPM_HASH = "009ad6b9c592eb3aca1ca99e666cbe66fd73489f6df32d3b667740aa5934aaf77b275145d517054fdcb30db711ab765e7301788a92c848aea4860570467b1644"

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
