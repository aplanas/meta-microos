SUMMARY = "Development files to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "libyara-devel-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "3f40a54eba322116a74491cbbefcfb54ff79ccfe233f6aaa0ff8d7c97c04a5c79c0f1f0223104fe876c660f6e933c14d82a288d8cfc7b439ad2b845c05432a60"

RPROVIDES:${PN} += "libyara-devel \
pkgconfig-yara"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyara10 \
pkgconfig-jansson"

inherit rpm
