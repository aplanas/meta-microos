SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-git-3.2.1-12.3.noarch.rpm"
RPM_HASH = "a855b917f12e8a230c3ed438ef5cc9d03dede276a8d15e5bb0c4616270ab63e25e69769a0325b44b2a33e0c434830e67a55ff08a0f6d87d2212dc8fae55a194f"
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
