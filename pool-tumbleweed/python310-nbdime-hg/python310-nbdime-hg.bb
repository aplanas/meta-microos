SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-hg-3.2.1-14.1.noarch.rpm"
RPM_HASH = "32a78cb5b24cbcac380318de09d76cf02a98168692eaeec39e77c3c3ca0bbb8099e5c827371a4ee9b06e1825702a6ed493b068c7df15fbe533f5d48132755488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
