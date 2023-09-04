SUMMARY = "Tools to access the VHD image format"
DESCRIPTION = "Tools to access the Virtual Hard Disk (VHD) image format.  See libvhdi for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-tools-20221124-4.1.aarch64.rpm"
RPM_HASH = "6c94fe761da3de273f3a254f5a281e5bec4e0cee2c551d7b282961678ff6f782776bbe736d7b07368e85c2082f2843cc69bc8b058f0ef8177714799a0f2d2634"

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
