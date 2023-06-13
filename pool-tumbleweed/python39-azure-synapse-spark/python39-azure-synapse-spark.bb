SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-synapse-spark-0.7.0-1.8.noarch.rpm"
RPM_HASH = "a020b84e49e0dd232452982a37dca89c2884f3562bbac5e1bee6d6e78b11598c4c908207a96823c4ea8d37c7731b2d448689cff04942ddf8cd0e2a364d6ac618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-synapse-spark) \
python39-azure-synapse \
python39-azure-synapse-spark \
python3dist(azure-synapse-spark)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
