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

RPM_NAME = "python39-rpy2-3.4.4-1.12.noarch.rpm"
RPM_HASH = "b39bb996e320939bb5d0e1bf14bafeac5e74ec62b8408db526e2d64ad121d66fc3129ec9d33f72f2c2168ac15ff877bfc922ed0a43259f32fd709e30461b6386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpy2 \
python39-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python39-cffi \
python39-numpy \
readline"

inherit rpm
