SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python311-GridDataFormats-1.0.1-1.3.noarch.rpm"
RPM_HASH = "8bbc578234be5af4f2ee5f15c0429d125e6a558e8ad9651aa5a2faa63e0ad8e2b448ecbed692f9c5fb506eb6872df4a475f4431b73c8cc52a5185e53a06a37c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GridDataFormats \
python3.11dist-griddataformats \
python311-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python311-mrcfile \
python311-numpy \
python311-scipy"

inherit rpm
