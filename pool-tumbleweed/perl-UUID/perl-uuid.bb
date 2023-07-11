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

RPM_NAME = "perl-UUID-0.28-1.14.aarch64.rpm"
RPM_HASH = "3b947ce60868297efd83839bdab63f1f461c02d07f456fb8e64521266bdc9580662e8811815bd1115b3369b654769b6f495cb42d46106581a9a3f7d1f6221833"

RPROVIDES:${PN} += "perl-UUID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
