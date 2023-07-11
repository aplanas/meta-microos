SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python39-linstor-client-1.12.0-1.11.aarch64.rpm"
RPM_HASH = "5a3e025ce996dbd28e1ceddeea33f971e77cc6c334d292b5d13960c1896bec98f7663a9b1c98ca8ef4df82801894d65d3033a430f9234dbc6a043e58519062f2"

RPROVIDES:${PN} += "python3.9dist-linstor-client \
python39-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python39-linstor"

inherit rpm
