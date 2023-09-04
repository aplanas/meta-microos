SUMMARY = "Microsoft Azure Communication Job Router Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for JobRouter."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-communication-jobrouter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "07a00e8ff7f48acc7b7d7c195f3266acb5db2a0e6e55d61ac1a03c851695fce26e5bef223e87c6b0286401cd8b0f75749bc8e2b49210b2322c29edbd48fc6704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-jobrouter \
python39-azure-communication-jobrouter \
python3dist-azure-communication-jobrouter"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-dateutil \
python39-msrest"

inherit rpm
