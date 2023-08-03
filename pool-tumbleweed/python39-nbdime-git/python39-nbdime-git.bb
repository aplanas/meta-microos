SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-git-3.2.1-14.1.noarch.rpm"
RPM_HASH = "a6f8d44c423c6382ff8e78aeb671e5fca2661acd1a03529f977c0d7f90d372fc29f045a5735963d4626099904aac0b1e504fd4a5ff3a7a6e054770b91c3fc88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-git \
python39-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
git-core \
python39-nbdime"

inherit rpm
