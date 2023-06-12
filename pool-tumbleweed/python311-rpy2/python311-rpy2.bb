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

RPM_NAME = "python311-rpy2-3.4.4-1.10.noarch.rpm"
RPM_HASH = "cc50f7ce0af0256472d1cc12b09aeba34536f7907ec76f409014604309405c8fe5d5bba710a5d7d8a6a91d480b763061347f099e0dd6971af0d871d3a620531f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rpy2) \
python311-rpy2 \
python3dist(rpy2)"
RDEPENDS:${PN} += "R-base \
python(abi) \
python311-cffi \
python311-numpy \
readline"

inherit rpm
