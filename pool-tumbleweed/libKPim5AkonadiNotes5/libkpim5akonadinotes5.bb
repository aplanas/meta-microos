SUMMARY = "Library to implement management of notes in Akonadi"
DESCRIPTION = "Akonadi Notes is a library that bridges the type-agnostic API of \
the Akonadi client libraries and the domain-specific KMime library. It provides \
a helper class for note attachments and for wrapping notes into KMime::Message \
objects."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiNotes5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d30ae690c622270e0dd7eeb0a15469b31b12042a4373db4f18f432ec2c947f15d2d91e9e22ab55f738b8d2e59dc4707814c4f24e066555b355fd4acaaf2b10c5"

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
