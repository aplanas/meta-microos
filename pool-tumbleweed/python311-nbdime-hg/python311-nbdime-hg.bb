SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-hg-3.2.1-12.3.noarch.rpm"
RPM_HASH = "cf209d629444d2efbb8c93b530cad95eb6649874f68a1018a4cbc1620f050a34f4c3389c24a4d5f20eb18887f48824ae09e212a0e36164a99934a9770c6b95d7"
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
