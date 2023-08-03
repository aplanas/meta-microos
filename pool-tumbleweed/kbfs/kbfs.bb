SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "ecc9b9bbf4871d0bd9ff3805d7d902a4b8b8ccdf28c758454e8bbae2ba07c831423f32b0b47df2c5ef0f233aef4a45da43687bd10a66fa7c7434c20f829b8e65"

RPROVIDES:${PN} += "kbfs"

RDEPENDS:${PN} += "/usr/bin/sh \
keybase-client"

inherit rpm
