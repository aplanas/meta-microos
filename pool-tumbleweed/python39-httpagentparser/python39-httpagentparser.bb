SUMMARY = "Extracts OS Browser etc information from http user agent string"
DESCRIPTION = "Extracts OS Browser etc information from http user agent string"
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "python39-httpagentparser-1.9.5-1.1.noarch.rpm"
RPM_HASH = "eb66a7f48a38326ac77930ea877a9a0d121ab165deec23c3e1ce71c0956e04511612d5e26d9b8f687075ab8ae87627e9b6ea62ceb1b289608604826ddf87fa2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpagentparser \
python39-httpagentparser \
python3dist-httpagentparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
