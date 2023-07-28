SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-git-3.2.1-13.1.noarch.rpm"
RPM_HASH = "536d8d076e8aca80e5cd24bb8aa638eaef4988980a493d11fe212be5db75dfd1f319d2d74e1d6d1018103e490e838741487a07a69578fa1662a1b7829d4c54d8"
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
