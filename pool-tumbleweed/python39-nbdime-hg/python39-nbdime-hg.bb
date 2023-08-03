SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-hg-3.2.1-14.1.noarch.rpm"
RPM_HASH = "1608ad7a5225afb61693bcafb45cb370a8fa2d93f1a09826af7f2e3871eda739c529317169ccfda207b2a43ff9efa11ffe03f0150c6242a21f9678195508d429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-hg \
python39-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
mercurial \
python39-nbdime"

inherit rpm
