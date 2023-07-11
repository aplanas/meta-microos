SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python311-elastic-transport-8.4.0-4.3.noarch.rpm"
RPM_HASH = "4ef8be73e2d57c17d90d6702b6268c3d98829d08ccc4e3061b9b840bcc1ed1e7b19577cbe342d0d9dd0820c9b98103f949befd8c95fb17bd3560fec89f452fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elastic-transport \
python3.11dist-elastic-transport \
python311-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "-python311-urllib3 >= 1.26.2 \
python-abi \
python311-certifi"

inherit rpm
