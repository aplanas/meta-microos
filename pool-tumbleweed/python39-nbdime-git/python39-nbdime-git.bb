SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-git-3.2.1-15.1.noarch.rpm"
RPM_HASH = "461bc920e5805e95badd1b0785db3a57b18141c5828b61767e185f24dfa2ededbec752346a29dfa48b34c0929094c4796082fc1047b31117de6f074d6ac380f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-git \
python39-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
git-core \
python39-nbdime"

inherit rpm
