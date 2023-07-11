SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python310-jupyter-core-5.3.1-1.1.noarch.rpm"
RPM_HASH = "b60ee606a8816d0b464f356d031a617f6ef80d580b26972163e5d2c90b4c73a3a752f540d9511971fe053ddfb239a3da2ca703f2d25798f712aafcdf81abfc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-core \
python310-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-platformdirs \
python310-traitlets"

inherit rpm
