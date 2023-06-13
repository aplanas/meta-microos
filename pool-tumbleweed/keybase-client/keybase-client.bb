SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "keybase-client-6.0.2-3.4.aarch64.rpm"
RPM_HASH = "b412d227a05f03d5ee52124307c9f77aab23385f81b3b39a8d4b9c6807c12083049e181fccdd1e5289dfd4d611a204e09b15aa4c2ba38e7d57c32cfb00f2bc0d"

RPROVIDES:${PN} += "keybase-client \
keybase-client(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
