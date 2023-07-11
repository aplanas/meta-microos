SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python311-linstor-client-1.12.0-1.11.aarch64.rpm"
RPM_HASH = "2b2bc18b9631b24152fd0ab53d8f99086fdd546621c3ebc5925624e21f633292ec152d282e3fdc09c49035e2ef6cd0ea435f19a6258d9ae852f801c756d9f208"

RPROVIDES:${PN} += "python3-linstor-client \
python3.11dist-linstor-client \
python311-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python311-linstor"

inherit rpm
