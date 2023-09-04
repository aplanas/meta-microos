SUMMARY = "Keybase command line client"
DESCRIPTION = "The Keybase command line client allows to manage a keybase.io account from \
the command line. It includes functionality for encryption, signing, and \
signature verifcation. It can create proofs to link a PGP key to other \
accounts like Twitter, Github, or a Homepage. In addition, it allows to look \
up keys for such accounts that people have created a proof for."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "keybase-client-6.2.2-2.1.aarch64.rpm"
RPM_HASH = "b562cbbbc4bf443e9409d9a384893908669b4e7fed7a5ebdcefcb19baac878b32315883393b0d306380c1e1d2ce66753d135f59ae783c3340905c106736bcfb3"

RPROVIDES:${PN} += "keybase-client"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
