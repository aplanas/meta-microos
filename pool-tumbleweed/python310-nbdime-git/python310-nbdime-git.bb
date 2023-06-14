SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-git-3.2.1-12.2.noarch.rpm"
RPM_HASH = "1b7c019610d1615647b506ae5454d98b7c16fe12bb0080ca509d6127e997faa31a653d28b40167ef41f8fef2693ea352ad195563bd1502b3a61825aef95e9f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-git \
python3-jupyter-nbdime-git \
python3-nbdime-git \
python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
git-core \
python310-nbdime"

inherit rpm
