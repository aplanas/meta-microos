SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "libd0_rijndael0-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "fc1e8d723f496d81702363bd4894acdffbbbc2f7d90586ca7d69d2fe8d8e32d0ec76830f7d08c2e2edf28a750ef2059a228107c3bd25e813477873566970601e"

RPROVIDES:${PN} += "libd0-rijndael.so.0 \
libd0-rijndael0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
