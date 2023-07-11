SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-6.0.2-3.5.aarch64.rpm"
RPM_HASH = "97489414e5752243dcc9bf59df1fb8ff39130318d152264cbc9ba53fd0ed5725e229f097f0d1b0ae62dd517cac7a3707c9acd686e40ce430b71488b550854d07"

RPROVIDES:${PN} += "kbfs"

RDEPENDS:${PN} += "/usr/bin/sh \
keybase-client"

inherit rpm
