SUMMARY = "Library to implement management of notes in Akonadi"
DESCRIPTION = "Akonadi Notes is a library that bridges the type-agnostic API of \
the Akonadi client libraries and the domain-specific KMime library. It provides \
a helper class for note attachments and for wrapping notes into KMime::Message \
objects."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiNotes5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "20a42571db969dcd2a60a020db7741f1674b60109d43b3db4a1abfbd57f03a3af94f35432968ef57cf15b8749e82451a27fc8b746a9de7fd18d62fd90553cefe"

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
