SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-hg-3.2.1-12.2.noarch.rpm"
RPM_HASH = "da93c4bbdc3cc7024d539e32ccefd8c5f955b48c62d82bb38e6cb4a62f61597c864aae87681f32269113e3d16220f20bcf3bcb13616a24232d952c71aadfd67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-hg \
python3-jupyter-nbdime-hg \
python3-nbdime-hg \
python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
