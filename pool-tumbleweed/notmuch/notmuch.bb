SUMMARY = "The mail indexer"
DESCRIPTION = "Because dealing with your mail can be so much better. \
 \
'Not much mail' is what Notmuch thinks about your email collection. Even if \
you receive 12000 messages per month or have on the order of millions of \
messages that you've been saving for decades. Regardless, Notmuch will be \
able to quickly search all of it. It's just plain not much mail. \
 \
'Not much mail' is also what you should have in your inbox at any time. \
Notmuch gives you what you need, (tags and fast search), so that you can \
keep your inbox tamed and focus on what really matters in your life, (which \
is surely not email). \
 \
Notmuch is an answer to Sup. Sup is a very good email program written by \
William Morgan (and others) and is the direct inspiration for Notmuch. \
Notmuch began as an effort to rewrite performance-critical pieces of Sup in \
C rather than ruby. From there, it grew into a separate project. One \
significant contribution Notmuch makes compared to Sup is the separation of \
the indexer/searcher from the user interface. (Notmuch provides a library \
interface so that its indexing/searching/tagging features can be integrated \
into any email program.) \
 \
Notmuch is not much of an email program. It doesn't receive messages (no \
POP or IMAP support). It doesn't send messages (no mail composer, no \
network code at all). And for what it does do (email search) that work is \
provided by an external library, Xapian. So if Notmuch provides no user \
interface and Xapian does all the heavy lifting, then what's left here? Not \
much."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-0.37-2.6.aarch64.rpm"
RPM_HASH = "b1c6af24a9a37871fae097b9fe628fefd0a26cf98c70bb413b4988ab412aaab47d9e8496f13ed6ed6c2714b65b8edafdfcc81c6061e196e86af887b25ec4801b"

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
