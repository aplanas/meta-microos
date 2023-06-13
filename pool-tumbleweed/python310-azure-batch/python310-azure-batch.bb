SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.0.0"

RPM_NAME = "python310-azure-batch-13.0.0-1.3.noarch.rpm"
RPM_HASH = "5057119812f41250aab59ba4d1b0a39ba72674a073db1ecb28b3a20d6750b201dcf8e68e223dee4ca2b9945583e6889d91f6dacc9496c41b0e673753ba7d92ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-batch \
python3.10dist(azure-batch) \
python310-azure-batch \
python3dist(azure-batch)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
