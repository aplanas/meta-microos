SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-git-3.2.1-13.1.noarch.rpm"
RPM_HASH = "fbd3ca8a9469eda422361b757d2a8fed45f4869963fcced0520a902d6ca172ae1bf93b01c1d0f640afe254ef51c42a464b6cf229839c1e93746b50ce2582e56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-git \
python39-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
git-core \
python39-nbdime"

inherit rpm
