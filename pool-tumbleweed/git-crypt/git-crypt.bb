SUMMARY = "Transparent file encryption in git"
DESCRIPTION = "git-crypt enables transparent encryption and decryption of files in a git \
repository. Files which you choose to protect are encrypted when committed, and \
decrypted when checked out. git-crypt lets you freely share a repository \
containing a mix of public and private content. git-crypt gracefully degrades, \
so developers without the secret key can still clone and commit to a repository \
with encrypted files. This lets you store your secret material (such as keys or \
passwords) in the same repository as your code, without requiring you to lock \
down your entire repository."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "git-crypt-0.7.0-2.3.aarch64.rpm"
RPM_HASH = "2b641336babdbd645963a83945fb48244ce4752733bd93cf5786c51b77851ffe831cacc1f1c0f1e7812874d788a003c44c4f951704775c3a482765e2f4fd5d6d"

RPROVIDES:${PN} += "git-crypt \
git-crypt(aarch-64)"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
