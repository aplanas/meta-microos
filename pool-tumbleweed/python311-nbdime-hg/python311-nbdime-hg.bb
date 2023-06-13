SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-hg-3.2.1-12.2.noarch.rpm"
RPM_HASH = "bc95b987e32ccfe22504cdf4080d5cb65f94dd1ccc20d62f02f9176000c7705b672f46da832ac3674a6d26600232e4ce99732d02762870ae81bfa03f1cdc5c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter_nbdime-hg \
python311-nbdime-hg"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
mercurial \
python311-nbdime"

inherit rpm
