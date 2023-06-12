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

RPM_NAME = "python39-rpy2-3.4.4-1.10.noarch.rpm"
RPM_HASH = "a3c56f79b6815d7466cf73dff9fc8e6a1e47c51cb8582efa08146934fbcf858c3fd0ef2cf4ac83013d388cbe5d398d4767654b58c98df588a82edfdd2a63e1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rpy2) \
python39-rpy2 \
python3dist(rpy2)"
RDEPENDS:${PN} += "R-base \
python(abi) \
python39-cffi \
python39-numpy \
readline"

inherit rpm
