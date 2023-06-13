SUMMARY = "Tools for translating DocBook XML files with Gettext"
DESCRIPTION = "This is a collection of tools that facilitate translating DocBook XML \
files using Gettext message files (PO files)."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kde-l10n-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e02f8510ee1b792b9f3b0271a11eaaa40340d639ba39d4a367a608c9e52cad22e896bcb31920efee5d4a1ee35f51338a80c8f51b7365a75cc5914cc521c79c97"

RPROVIDES:${PN} += "kde-l10n-devel \
kde-l10n-devel(aarch-64) \
kde4-l10n-devel \
poxml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgettextpo.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
