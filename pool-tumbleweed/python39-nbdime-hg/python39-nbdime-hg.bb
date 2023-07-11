SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-hg-3.2.1-12.3.noarch.rpm"
RPM_HASH = "66f153ec0c154a50491c2285deb77bfe3744515040ddf3c04a676c039c4a9f247db88b4cc9a4899acda310892713c3dcaed01f93c3d5906b47c69b5c2fc63295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-hg \
python39-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
mercurial \
python39-nbdime"

inherit rpm
