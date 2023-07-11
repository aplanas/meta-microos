SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "keybase-client-6.0.2-3.5.aarch64.rpm"
RPM_HASH = "819cfe2fc36e195a8576e10ffd00f7a9348324c38fe9b1b3f423f150094cf3da2d20b1b08d66e42fc2c070900353be62f8de9cf119611448dcca10085e85b5eb"

RPROVIDES:${PN} += "keybase-client"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
