SUMMARY = "A GUI for Git"
DESCRIPTION = "git-cola is a graphical user interface for Git that provides a way to \
interact with Git repositories."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "git-cola-4.2.1-1.2.noarch.rpm"
RPM_HASH = "a0d2b97da77cc43b42efb4091539d802d37bcf8acc339146bf2e22561967f7329ce3bf52f95463a39f089325624ce4108ff916ddc11ecb912f1113ca1bbc9706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cola \
python3.11dist-git-cola \
python3dist-git-cola"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python3-QtPy \
python3-qt5"

inherit rpm
