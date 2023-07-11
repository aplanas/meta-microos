SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-hg-3.2.1-12.3.noarch.rpm"
RPM_HASH = "0675a359b29da2f261090b26f44e1f42d1f6f8b0e9b29646345bba578aae7c2746948c7d731e4a7ecf1c47ec06ffa6803684fc3f1fca1256bf97dba36d1d9289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
