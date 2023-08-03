SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-git-3.2.1-14.1.noarch.rpm"
RPM_HASH = "1531496789f0fcd4107b112450e73e71d8b17e084b9a506f742f5b69656a71918e5131a09faaf71fce14ef3b897f77cb798955f817df7924cc2a2acda2546878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
git-core \
python310-nbdime"

inherit rpm
