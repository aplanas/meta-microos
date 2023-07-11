SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python310-GridDataFormats-1.0.1-1.3.noarch.rpm"
RPM_HASH = "94dab24f4f127eb67af464597b71f3826a89ce3fcafd0fe1a59bf9a5e6da69c4cf4fcffd99217c929f0b610dd186dc4e28c90ad363e4b4f2ad53759dcd478107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-griddataformats \
python310-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python310-mrcfile \
python310-numpy \
python310-scipy"

inherit rpm
