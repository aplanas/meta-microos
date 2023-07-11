SUMMARY = "Files needed for developing Ruby scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Ruby scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "ruby-xapian-1.4.21-2.7.aarch64.rpm"
RPM_HASH = "d6cd98f680f2cb262926ca75e6762fbec23aae5db982f83b3a83e012926a7d0f1a23d1ad5f7d6aea28a7bbe9ad6c8d5e42a1cde82277d91aff92b2b6b0b3955e"

RPROVIDES:${PN} += "ruby-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
ruby"

inherit rpm
