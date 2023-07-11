SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-config-7.2.5-1.3.noarch.rpm"
RPM_HASH = "59ec1933949a397584a0647af161e8e53700b56cea4fc3f5cbba611c5863fa8d9e6fe3d3c5f7a957301c96aed3ef86c1de7db698568db4a18dd8eec60222254d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"

RDEPENDS:${PN} += "python3-keylime"

inherit rpm
