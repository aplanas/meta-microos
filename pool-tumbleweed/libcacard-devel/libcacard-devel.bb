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

RPM_NAME = "libcacard-devel-2.8.1-1.7.aarch64.rpm"
RPM_HASH = "6e3ab83ab877c2e170547781a6915b9c249acbe3049f1192c54a12c1e2a4d7c5816bf3699378cd392df079e6c15b1faee6d33f862eb489fe23bd4c2bc96692f0"

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
