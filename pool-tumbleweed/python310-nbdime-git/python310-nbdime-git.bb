SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-git-3.2.1-12.3.noarch.rpm"
RPM_HASH = "8c281500dd81530dd7b69115e5c1f45874c3b6d7ac665609684cb0e02b4c59f7b1c164a495a52a58d08f6a0c98fea8bff0b75c566014d4e5f7786f39d0753624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
git-core \
python310-nbdime"

inherit rpm
