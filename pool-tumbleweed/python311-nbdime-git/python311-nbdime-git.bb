SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-git-3.2.1-14.1.noarch.rpm"
RPM_HASH = "dfd8494abac61335d7c116f7d7dab93e3948fc410622e2b2a3ed7b888591fef61c37b094b971b3c548ded0f2feac144bb689ec119d519090852edbc11001160d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-git \
python3-jupyter-nbdime-git \
python3-nbdime-git \
python311-jupyter-nbdime-git \
python311-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
git-core \
python311-nbdime"

inherit rpm
