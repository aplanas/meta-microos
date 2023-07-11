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

RPM_NAME = "python311-rpy2-3.4.4-1.12.noarch.rpm"
RPM_HASH = "1a94de7cb56113d57c9e21dc72fe6168e2f7603462adeb484afccc5ccfb9e7c3109cedd7ee92bc28525db67b0cf7ad587d816390e2a04a455c0339033846732c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpy2 \
python3.11dist-rpy2 \
python311-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python311-cffi \
python311-numpy \
readline"

inherit rpm
