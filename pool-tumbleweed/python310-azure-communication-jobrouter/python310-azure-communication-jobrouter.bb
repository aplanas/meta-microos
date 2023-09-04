SUMMARY = "Microsoft Azure Communication Job Router Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for JobRouter."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-communication-jobrouter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "0322e84bbcbe284cb96b4fea0815fedb84b287c96f80ac61784263174c63dc9e2d7f5806a2a1ddc81248b8e6c9dca904d27790ec58616d1b256503a1accd3351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-jobrouter \
python310-azure-communication-jobrouter \
python3dist-azure-communication-jobrouter"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-dateutil \
python310-msrest"

inherit rpm
