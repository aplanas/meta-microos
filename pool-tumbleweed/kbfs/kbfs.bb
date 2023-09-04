SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-6.2.2-2.1.aarch64.rpm"
RPM_HASH = "adc3e1fd70fdc6fe5d79157c2958b4d1e1342f8b1389a48d3510cbea34732cfa7f51f1c27cccc22faa93a7c68f00dffee3deeced35d1807c1e5a3c51c042f4e4"

RPROVIDES:${PN} += "kbfs"

RDEPENDS:${PN} += "/usr/bin/sh \
keybase-client"

inherit rpm
