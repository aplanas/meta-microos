SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "keybase-client-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "f5d5acfcef481acd1c6e712c5aae8f8fc4784f9fdaeda37868c211e4ff36b19b751de68eb3953efa64315e00ea200f463438ab0eed98b8c4b02ae9f992bc7063"

RPROVIDES:${PN} += "keybase-client"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
