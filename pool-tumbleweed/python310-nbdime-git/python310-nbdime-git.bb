SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-git-3.2.1-13.1.noarch.rpm"
RPM_HASH = "ea4f7cd2546657d6ca9f1c925e33e95b36331a86fd0ab0d2bf8503f64240572318ca3dcdcbd0c7561dcb2d0a2520a3988afb6def4652072dac32cea96aadb2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
git-core \
python310-nbdime"

inherit rpm
