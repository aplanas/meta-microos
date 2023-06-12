SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-6.0.2-3.4.aarch64.rpm"
RPM_HASH = "230dbbe98de59a862231c591defd01f6ea1c92e3850f57d06d769a1494ba45461b33c66aac1f7ca28525255c006a5842146ad15b50b57640625c6f748d8cefee"

RPROVIDES:${PN} += "kbfs \
kbfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
keybase-client"

inherit rpm
