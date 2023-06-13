SUMMARY = "Encrypted git repositories"
DESCRIPTION = "This lets git store git repositories in encrypted form. \
It supports storing repositories on rsync or sftp servers. \
It can also store the encrypted git repository inside a remote git \
repository. All the regular git commands like git push and git pull \
can be used to operate on such an encrypted repository. \
 \
The aim is to provide confidential, authenticated git storage and \
collaboration using typical untrusted file hosts or services."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "git-remote-gcrypt-1.5-1.2.noarch.rpm"
RPM_HASH = "b393baa7f4fd9d37f4fae5b146dc81bd1321f49e21d84a383690a64c5576696eb469ed06aa0f54ea37fcc345cbf7d7a05bb92ad4787b5ddca02646ae3b63e6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-remote-gcrypt"

RDEPENDS:${PN} += "/bin/sh \
curl \
git \
gpg2 \
rsync"

inherit rpm
