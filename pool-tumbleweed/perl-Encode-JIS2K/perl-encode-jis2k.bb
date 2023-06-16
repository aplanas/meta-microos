SUMMARY = "JIS X 0212 (aka JIS 2000) Encodings"
DESCRIPTION = "This module implements encodings that covers JIS X 0213 charset (AKA \
JIS 2000, hence the module name)."
LICENSE = "Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Encode-JIS2K-0.03-1.23.aarch64.rpm"
RPM_HASH = "ec927a971fc1ed323d639b63be935fb23f5d98ea9fcd3e68a4d4f089ab85163ef96ede0100a97d3caafca64f0a2d867b27f23f617410344a34347d4c5c8244f1"

RPROVIDES:${PN} += "perl-Encode--JIS2K \
perl-Encode--JIS2K--2022JP3 \
perl-Encode-JIS2K"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
