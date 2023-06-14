SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.0.0"

RPM_NAME = "python39-azure-batch-13.0.0-1.3.noarch.rpm"
RPM_HASH = "a976cf090b2391c83e8b541225890864612f032ddfad7e975e122c655770f8aa62539958b47d29e8796feb392491aaf205827d765c80f829a41d6b08d706339e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-batch \
python39-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm
