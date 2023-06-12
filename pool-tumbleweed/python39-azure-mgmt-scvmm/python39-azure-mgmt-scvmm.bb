SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-scvmm-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "29aaf32c2b0518ea299eb0241cbacb7dbb9485a99c68fd0148880218c87dccd266df91188b86544d62ffa2baf92df0246ffa891a20d748505f6bff7c7b78bd32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-scvmm) \
python39-azure-mgmt-scvmm \
python3dist(azure-mgmt-scvmm)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
