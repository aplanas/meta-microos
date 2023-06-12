SUMMARY = "Widget for docker containers running"
DESCRIPTION = "Displays the number of docker containers running."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-docker-ps-2.1.5-3.3.noarch.rpm"
RPM_HASH = "249e8813052212ae262a039e2460d480423d4ee5c3103cb796b99bff7938bc6f99c52562f2ce9cd2910bc45d3a950612fe1654210fdb3cdf8fa06d35af0427a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-docker-ps"
RDEPENDS:${PN} += "bumblebee-status \
python3-docker"

inherit rpm
