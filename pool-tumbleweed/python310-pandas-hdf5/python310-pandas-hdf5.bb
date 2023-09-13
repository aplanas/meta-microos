SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-hdf5-2.1.0-1.2.noarch.rpm"
RPM_HASH = "0e46735dff02b66b929a406df8f83a64dd761cbe8962e887a9c538bb49ef71da96f621e5f8dcf4d521c2fc3f5133c049aa007e996bd649e5b5bfcc6281367f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-hdf5"

RDEPENDS:${PN} += "python310-blosc \
python310-pandas \
python310-tables"

inherit rpm
