SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-hg-3.2.1-13.1.noarch.rpm"
RPM_HASH = "7165f4a5711cf3347f726428fedd06f1c8a94d652bb13d9a4bf23073903252a5b57a33ee6be479b5328d42ee970e7dc78b0440d0844dbecc1b2aeb708af3fd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-hg \
python3-jupyter-nbdime-hg \
python3-nbdime-hg \
python311-jupyter-nbdime-hg \
python311-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
mercurial \
python311-nbdime"

inherit rpm
