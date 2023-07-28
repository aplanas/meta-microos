SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-hg-3.2.1-13.1.noarch.rpm"
RPM_HASH = "2eca2c981f85ee5e3ad1407e1567d548ee4edf77864dd5edc35bff22ad39056c25ba3167fc9a13402ca28787ddb4fa7cb3df20c6fd6a9d2d2adcb545778f6eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
