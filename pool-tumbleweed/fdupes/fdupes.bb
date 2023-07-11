SUMMARY = "Tool to identify or delete duplicate files"
DESCRIPTION = "FDUPES is a program for identifying or deleting duplicate files \
residing within specified directories."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "fdupes-2.2.1-1.4.aarch64.rpm"
RPM_HASH = "de8d61fecdfe89d1a4a446632f319c8315b9fb98ed398c26537e70533a491c7a28b13c212be4989f4a2e1af93059ac82edf607aae4dbf9668daa9a67323685a3"

RPROVIDES:${PN} += "fdupes \
rpm-macro-fdupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
