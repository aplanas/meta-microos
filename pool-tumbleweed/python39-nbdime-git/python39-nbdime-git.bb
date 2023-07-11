SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-git-3.2.1-12.3.noarch.rpm"
RPM_HASH = "286efa34923b83d902f14fed7e6e11ac0f93d8855e36b881e93b2bda81dc42eb919d6258b2e44c5b2946c3847981d1e88e49b2a46e3ffe1255f2d4769d6a4c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-git \
python39-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
git-core \
python39-nbdime"

inherit rpm
