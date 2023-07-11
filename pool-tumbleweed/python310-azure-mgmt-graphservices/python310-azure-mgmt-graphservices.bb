SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-graphservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "61f22e4c141ef5230c91bc20f3e7404dca149c7026d78389c0fd0ef0b5a8c9f6414eb58c5b645c640bd629f1d0dc0a05286088682d0d039b6ada7a77af3c5f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-graphservices \
python310-azure-mgmt-graphservices \
python3dist-azure-mgmt-graphservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
