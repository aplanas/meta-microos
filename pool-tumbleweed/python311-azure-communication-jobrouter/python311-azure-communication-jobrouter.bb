SUMMARY = "Microsoft Azure Communication Job Router Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for JobRouter."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-communication-jobrouter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "8af56e6497c91490b2a288f2bb876f9d6631b366d7e1f75142e0a1dbbd9852c4c3ce269142ec0666d9e31a84932f4a36973edff0fd4bd21c2efa66f63829f9ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-jobrouter \
python3.11dist-azure-communication-jobrouter \
python311-azure-communication-jobrouter \
python3dist-azure-communication-jobrouter"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-dateutil \
python311-msrest"

inherit rpm
