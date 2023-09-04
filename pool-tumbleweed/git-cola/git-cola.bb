SUMMARY = "A GUI for Git"
DESCRIPTION = "git-cola is a graphical user interface for Git that provides a way to \
interact with Git repositories."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "git-cola-4.3.1-1.1.noarch.rpm"
RPM_HASH = "86a4cc4e598d8364e1435611097ca2fd7cb7df69c4f4e8f10f82aab7d350427cbbf270d2eea2220a72076a100a9d3814eab438411a82e64ee969ef5ba9a28c84"
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
