SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-communication-rooms-1.0.0-1.3.noarch.rpm"
RPM_HASH = "ce3f9c5a41a12201756f9bb0ae09fb3ac0dc58c537c46aad6dd9cf94e5b1e15cf8e075ef9896a0da935601822e5e6f6f20099466eff3ef67b6a51b9b907bfc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-rooms \
python3.11dist-azure-communication-rooms \
python311-azure-communication-rooms \
python3dist-azure-communication-rooms"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
