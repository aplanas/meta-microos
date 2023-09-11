SUMMARY = "A GUI for Git"
DESCRIPTION = "git-cola is a graphical user interface for Git that provides a way to \
interact with Git repositories."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "git-cola-4.3.2-1.1.noarch.rpm"
RPM_HASH = "59ea679a152cc51b033353d6625c66acae73d423815b68788c5de0b15d0d4ba8ed08aa6e04ce1945b2ca8d761243f5ac45a62bc78db22a3e7ed3bf50c13e4927"
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
