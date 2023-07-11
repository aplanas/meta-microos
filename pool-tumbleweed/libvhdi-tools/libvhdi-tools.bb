SUMMARY = "Tools to access the VHD image format"
DESCRIPTION = "Tools to access the Virtual Hard Disk (VHD) image format.  See libvhdi for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-tools-20221124-3.10.aarch64.rpm"
RPM_HASH = "ad138f94914f0537c7163d5db7694bf241e41c892421cc1374d2260480194f90383f6d26686de5b11f4d77b5d57ff81123053a182c1a137b7f7404bce6e4e56a"

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
