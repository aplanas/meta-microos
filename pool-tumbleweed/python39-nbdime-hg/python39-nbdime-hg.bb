SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-hg-3.2.1-15.1.noarch.rpm"
RPM_HASH = "8f06a1d344bc342a55d6a048fd369b688c7339543ceb360a7fb6e1be511d63ed59443936880720abc3a2530799ad6f2c19adabe6c1af0d8e89e8c31e7d4b1226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-hg \
python39-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
mercurial \
python39-nbdime"

inherit rpm
