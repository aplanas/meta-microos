SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-nbdime-hg-3.2.1-13.1.noarch.rpm"
RPM_HASH = "e38c93e651fb913f6a5fa11a1a67babcc8394ecd53f5b3f6cc028bab9bed0e3701c81f1c97a794d777c10f13310475a4971d37ad515739edfdff1999057b6a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-nbdime-hg \
python39-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
mercurial \
python39-nbdime"

inherit rpm
