SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-hg-3.2.1-15.1.noarch.rpm"
RPM_HASH = "ea2fffa90aa1a07758ffe3141c6b1c207a52a85b37150d569f37878d6a2d948b08f194d22f515301a98e9719b9586585eae06ff90605b76dce4c8805708b058b"
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
