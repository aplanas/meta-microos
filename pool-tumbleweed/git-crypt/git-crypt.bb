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

RPM_NAME = "git-crypt-0.7.0-2.4.aarch64.rpm"
RPM_HASH = "c42b65119778a7f14c432d7fcceae29405160f0e8103f779de5bcd5531967308b3836c5c696fe28f0851ab0586d5117f66b9613464179d1efa703222f8baf140"

RPROVIDES:${PN} += "git-crypt"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
