SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-synapse-spark-0.7.0-1.10.noarch.rpm"
RPM_HASH = "c75ce831ae532aa700213b06601a6d3e0a506a4f7783afd11ac9019acef37d6d6c181301a6861c468eaf24290d5ef1bb71ae35e4656ea5be3790721b867425cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-synapse-spark \
python39-azure-synapse \
python39-azure-synapse-spark \
python3dist-azure-synapse-spark"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-synapse-nspkg \
python39-msrest"

inherit rpm
