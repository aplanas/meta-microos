SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python39-GridDataFormats-1.0.1-1.3.noarch.rpm"
RPM_HASH = "22841eb3632a9246cd58a17dfb47514598ebc9369211fdf0f2986ae178eb1fcc7a2eb88647623df9e2c77380f5f2a96b3c5a6846a5e47d709ef174daa889f2b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-griddataformats \
python39-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python39-mrcfile \
python39-numpy \
python39-scipy"

inherit rpm
