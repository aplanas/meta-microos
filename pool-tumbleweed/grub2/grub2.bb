SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-2.06-54.1.aarch64.rpm"
RPM_HASH = "68e90f11c08d91f61a472b5fea1858064832e727894a7237027c84dce1134559d4d0f7c825c6befa5b3bba9604b8b3d4a2b9da1e6671d53004f0a51e4ff9e543"

RPROVIDES:${PN} += "config-grub2 \
grub2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gettext-runtime \
libc.so.6 \
libdevmapper.so.1.03 \
libfreetype.so.6 \
libfuse.so.2 \
liblzma.so.5 \
libtasn1.so.6"

inherit rpm
