SUMMARY = "A Python interface to the R Programming Language"
DESCRIPTION = "RPy is a Python interface to the R Programming Language. It can \
manage all kinds of R objects and can execute arbitrary R functions \
(including the graphic functions). All errors from the R language are \
converted to Python exceptions. Any module installed for the R system \
can be used from Python. \
 \
This code is inspired by RSPython from the Omegahat project."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python310-rpy2-3.4.4-1.12.noarch.rpm"
RPM_HASH = "57536f6b49f18ee6707ec92ddad166d71fa5050216fa887c032a19560980d560acb670de248b527f95f8c78d612d7f2ae883fe6bf02c21be36f19a9f2beba31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rpy2 \
python310-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python310-cffi \
python310-numpy \
readline"

inherit rpm
