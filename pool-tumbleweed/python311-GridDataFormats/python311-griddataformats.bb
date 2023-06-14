SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python311-GridDataFormats-1.0.1-1.1.noarch.rpm"
RPM_HASH = "d44102e9ae1cf542c4d6d8a4aa12143aff5e64587009bba88f3254b60755ae7ed3cb62bfe2c88e4051a6f3864afb8de5e454588a6a8ed6da8f613d35caffbe1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-griddataformats \
python311-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python311-mrcfile \
python311-numpy \
python311-scipy"

inherit rpm
