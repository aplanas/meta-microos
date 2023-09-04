SUMMARY = "DCE compatible Universally Unique Identifier library for Perl"
DESCRIPTION = "The UUID library is used to generate unique identifiers for objects that \
may be accessible beyond the local system. For instance, they could be used \
to generate unique HTTP cookies across multiple web servers without \
communication between the servers, and without fear of a name clash. \
 \
The generated UUIDs can be reasonably expected to be unique within a \
system, and unique across all systems, and are compatible with those \
created by the Open Software Foundation (OSF) Distributed Computing \
Environment (DCE) utility uuidgen."
LICENSE = "Artistic-2.0"

PV = "0.28"

RPM_NAME = "perl-UUID-0.28-1.15.aarch64.rpm"
RPM_HASH = "1c7b32088d4d4d4f1eb76260f006b872c4d271f894837ed336dfa764eda84ba2500a8a2605c16e35d1c1604bd31e57c53bdcb7143d50e67236fe227199e4822e"

RPROVIDES:${PN} += "perl-UUID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
