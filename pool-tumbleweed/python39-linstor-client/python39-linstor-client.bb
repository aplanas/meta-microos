SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python39-linstor-client-1.12.0-1.10.aarch64.rpm"
RPM_HASH = "9c1dc5ac8848d512e63e4d435f17ee3d48544f14aeffc1809fa58a86f1e309f93f915b0c82d773d357537b35898502cedc8f6bf03af22d9c5bdea2af89013914"

RPROVIDES:${PN} += "python3.9dist(linstor-client) \
python39-linstor-client \
python39-linstor-client(aarch-64) \
python3dist(linstor-client)"
RDEPENDS:${PN} += "python(abi) \
python39-linstor"

inherit rpm
