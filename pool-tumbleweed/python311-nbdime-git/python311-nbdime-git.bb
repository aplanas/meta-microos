SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-git-3.2.1-15.1.noarch.rpm"
RPM_HASH = "b5b77785f86becfb076f16d85a4468e89b88abff9cb649ed808dbca091e369cd3874c8c7cdd235e8615caee7e91708f7d9558d109308fd7a91d91f5f5379b38d"
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
