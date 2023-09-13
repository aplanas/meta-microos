SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-2.12~rc1-2.1.aarch64.rpm"
RPM_HASH = "a86137e0c7f900de370ae1a0541b0f266c1adf66b6a715057bee376050c3b7fb645d1c4b3d731f8cd4a5ec37b31f7197e179810cc130dea3e8de7858985663af"

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
