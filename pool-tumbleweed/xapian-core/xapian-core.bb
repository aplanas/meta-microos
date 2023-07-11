SUMMARY = "The Xapian Probabilistic Information Retrieval Library"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-1.4.21-1.4.aarch64.rpm"
RPM_HASH = "893e7c0adaa35590d027b8110bd0ea480eb0d8af27860d1bae69f013006b6736370135c3b507ac35e02fdbb33fe388b35d2cb9198b5faf13f4b17685bc7a456f"

RPROVIDES:${PN} += "xapian-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxapian.so.30 \
libxapian30"

inherit rpm
