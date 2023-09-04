SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-hg-3.2.1-15.1.noarch.rpm"
RPM_HASH = "b384c865c2c1f98296219a54317bc3a50092a4d7810f5b8c2a3d21b59f2b00f2c451b3845c88e8ce8e67ac9ce42456362d4bcca987a5dac95a51ea496661c5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
