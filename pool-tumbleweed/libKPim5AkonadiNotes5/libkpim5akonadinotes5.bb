SUMMARY = "Library to implement management of notes in Akonadi"
DESCRIPTION = "Akonadi Notes is a library that bridges the type-agnostic API of \
the Akonadi client libraries and the domain-specific KMime library. It provides \
a helper class for note attachments and for wrapping notes into KMime::Message \
objects."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiNotes5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7ece77cc338484c13d4c44de168c28709f8c9a818d32f93aeeac8472ec089d26cc4614202dfe299c4b71f42704394188aa544f10eb1a7214a26f5a2952c5c43d"

RPROVIDES:${PN} += "akonadi-notes \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiNotes5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
