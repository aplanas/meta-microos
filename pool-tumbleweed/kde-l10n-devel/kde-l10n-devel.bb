SUMMARY = "Tools for translating DocBook XML files with Gettext"
DESCRIPTION = "This is a collection of tools that facilitate translating DocBook XML \
files using Gettext message files (PO files)."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kde-l10n-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "53971668ce798fcc767d75ebc1000251a4c719544849ff35858ddee40ae141c59568ac487125a9642a3e10757088922c019174343a4eb802a9d9cf70db84af1b"

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
