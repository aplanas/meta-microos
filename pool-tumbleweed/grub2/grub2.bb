SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-2.06-53.1.aarch64.rpm"
RPM_HASH = "dcc876257a6aebf7d72a721bf446d9a602f5f1fb0dbdeb94cc016615b9a7b790f7db3350f5f85e80cb7a0f9f79f5b93a29730065d2e83297d17766e226648c87"

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
