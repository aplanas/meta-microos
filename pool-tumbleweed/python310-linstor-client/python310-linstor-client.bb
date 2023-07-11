SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python310-linstor-client-1.12.0-1.11.aarch64.rpm"
RPM_HASH = "35c98348cc4a4834c25fef485954dfafc29137e2040b4c87339fabc069b9e2d47e42ec1a2a78f18bdd0af246941e5816b1b872dd5aab3075be6e81c1ca094f5f"

RPROVIDES:${PN} += "python3.10dist-linstor-client \
python310-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python310-linstor"

inherit rpm
