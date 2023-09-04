SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-2.06-55.1.aarch64.rpm"
RPM_HASH = "d67788299ffd1f48ab008cc45b5a58b90d767b8d83c6fd42be83123a2e83570df93bec996721f492b29b3e5301c5ddda3a386cf8985eff1cd3e65b8591acad6f"

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
