SUMMARY = "A Key Management Application for SSH2 RSA/DSA and GnuPG Keys"
DESCRIPTION = "Keychain is an extremely handy OpenSSH, commercial SSH2-compatible \
RSA/DSA and GnuPG key management application. It acts as a front-end to \
the agents, allowing you to easily have one long-running agent process \
per system, rather than per login session. This dramatically reduces \
the number of times you need to enter your pass phrase from once per \
new login session to once every time your local machine is rebooted."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "keychain-2.8.5-2.4.noarch.rpm"
RPM_HASH = "ed06539a176e560369ae34098e1cdd3014305b1164e55bcb243b4eaf8d7fe2cce41eaece30892db7c99aae544eaac155cc1094190b7f61c786c95b6aa41c881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keychain"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
gpg \
openssh \
sed"

inherit rpm
