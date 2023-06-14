SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python39-GridDataFormats-1.0.1-1.1.noarch.rpm"
RPM_HASH = "3ca1d2992cdf545d4760f30d9ef5e3e083c5d2dbb94b409413f91ad5c77df25ac935b750823f10c8dbce53087cae80f11420ff6e1b00b4d8b2423d24117e9edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-griddataformats \
python39-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python39-mrcfile \
python39-numpy \
python39-scipy"

inherit rpm
