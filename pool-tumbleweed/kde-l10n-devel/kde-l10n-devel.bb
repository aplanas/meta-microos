SUMMARY = "Tools for translating DocBook XML files with Gettext"
DESCRIPTION = "This is a collection of tools that facilitate translating DocBook XML \
files using Gettext message files (PO files)."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kde-l10n-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4421cafd3df417e9e6de4c1edc6b4ae1554165301ef5fb7e9ef82afa88e66ae774422fb06dc3c82b6af349a984a850f0e37aaf8139d1917134e5f9f7acf0a42f"

RPROVIDES:${PN} += "kde-l10n-devel \
kde4-l10n-devel \
poxml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgettextpo.so.0 \
libstdc++.so.6"

inherit rpm
