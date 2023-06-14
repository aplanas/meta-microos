SUMMARY = "A GUI for Git"
DESCRIPTION = "git-cola is a graphical user interface for Git that provides a way to \
interact with Git repositories."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "git-cola-4.2.1-1.1.noarch.rpm"
RPM_HASH = "e2297c519da8a4d5e741f01dbd51b872c4cbe02eb2c0e9313b9662f357954556612380c12c66c1e674659641a692e9cecb88dbe9db3ef3bb156f6d7dd899b643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cola \
python3.10dist-git-cola \
python3dist-git-cola"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3.10 \
git-core \
python-abi \
python3-QtPy \
python3-qt5"

inherit rpm
