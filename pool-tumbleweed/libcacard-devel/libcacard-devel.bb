SUMMARY = "Common Access Card (CAC) emulation -- Development files"
DESCRIPTION = "This emulator is designed to provide emulation of actual smart cards to a \
virtual card reader running in a guest virtual machine. The emulated smart \
cards can be representations of real smart cards, where the necessary functions \
such as signing, card removal/insertion, etc. are mapped to real, physical \
cards which are shared with the client machine the emulator is running on, or \
the cards could be pure software constructs. \
 \
This sub-package contains development files for the Smartcard library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.1"

RPM_NAME = "libcacard-devel-2.8.1-1.8.aarch64.rpm"
RPM_HASH = "305aad420ae05d4324050fd2a40394f78537d552879a9420f879c25b75134d9d829ce8cc3e6f47a7c9339e103dc88d0f084773b340006c2c4abe1960bea33d5c"

RPROVIDES:${PN} += "libcacard-devel \
pkgconfig-libcacard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libcacard0 \
mozilla-nspr \
mozilla-nss \
pkgconfig-glib-2.0 \
pkgconfig-nss"

inherit rpm
