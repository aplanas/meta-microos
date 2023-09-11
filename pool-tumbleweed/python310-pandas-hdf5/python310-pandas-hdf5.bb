SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-hdf5-2.0.3-1.3.noarch.rpm"
RPM_HASH = "e69ed14ffd466a2fe5bd88a0129d8a1a9075b5b7a0210c5f138c27213b144d27cdc3de8e3557c3a6bd1a7716c4955211b9b86b46425e4f45e0e1de466dd4cd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-hdf5"

RDEPENDS:${PN} += "python310-blosc \
python310-pandas \
python310-tables"

inherit rpm
