SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-2.06-53.3.aarch64.rpm"
RPM_HASH = "30b6028997539b1336d76f21491f12dcaa19f8d6a8a167d1b8141fadd1c309680a52fd7ff932b22d830224ea00c1264912f25b672cd62caf239f6f48a60e62e6"

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
