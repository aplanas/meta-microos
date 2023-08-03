SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-hg-3.2.1-14.1.noarch.rpm"
RPM_HASH = "31bd39690201186e008c2003a07bc547abea1bb66e557afc306cb435c67799a053eaddb5d9257ec41c64ddf4ce520a3a335e4ab7c7b24d59d727d8b0b24e308b"
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
