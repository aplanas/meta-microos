SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python310-mysql-connector-python-8.0.19-2.17.noarch.rpm"
RPM_HASH = "dff839b5289d65d09faf0c8810c1bfd585dc3c1c0d065bacf0ce950d3d85ae00fa85e2499e2310a82ce7574dc099a855a8b37264c30696f792c1379df107588f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mysql-connector-python \
python310-mysql-connector-python \
python3dist-mysql-connector-python"

RDEPENDS:${PN} += "python-abi \
python310-dnspython \
python310-protobuf"

inherit rpm
