SUMMARY = "LRU Cache in Memory"
DESCRIPTION = "This module implements a least recently used (LRU) cache in memory through \
a tie interface. Any time data is stored in the tied hash, that key/value \
pair has an entry time associated with it, and as the cache fills up, those \
members of the cache that are the oldest are removed to make room for new \
entries. \
 \
So, the cache only 'remembers' the last written entries, up to the size of \
the cache. This can be especially useful if you access great amounts of \
data, but only access a minority of the data a majority of the time. \
 \
The implementation is a hash, for quick lookups, overlaying a doubly linked \
list for quick insertion and deletion. On a WinNT PII 300, writes to the \
hash were done at a rate 3100 per second, and reads from the hash at 6300 \
per second. Work has been done to optimize refreshing cache entries that \
are frequently read from, code like $cache{entry}, which moves the entry to \
the end of the linked list internally."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.21"

RPM_NAME = "perl-Tie-Cache-0.21-1.29.noarch.rpm"
RPM_HASH = "ab969ba820a5225d99aaa34599b8bdc6dc341ce37d1ca7e1a733a025280eb4e9f5e2dc9fefe7e9c1e174f1ae21cfb6a28990d4f5a984e92f7203899e3a05cb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Cache \
perl-Tie-Cache"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
