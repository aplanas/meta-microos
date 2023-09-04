SUMMARY = "The mail indexer"
DESCRIPTION = "A global-search and tag-based email system that can be used from a terminal or \
from within a text editor. Notmuch provides a library interface so that its \
indexing/searching/tagging features can be integrated elsewhere. \
 \
Notmuch is not much of an email program. It does not receive messages \
(no POP or IMAP support), it does not send messages (no mail \
composer, no network code at all). It does email search, for which it \
uses the Xapian library."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-0.37-3.1.aarch64.rpm"
RPM_HASH = "9c057faa6be05c7ca5045c60e80eef74600f9c2b0c75e32ce5fe4501c820dfe72b83a303c96e8bdbd9c90f2d739f6fdff489f03199da81b86c30d7d0026efd3f"

RPROVIDES:${PN} += "notmuch"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libnotmuch.so.5 \
libtalloc.so.2 \
libz.so.1"

inherit rpm
