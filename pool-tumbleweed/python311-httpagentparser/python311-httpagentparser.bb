SUMMARY = "Extracts OS Browser etc information from http user agent string"
DESCRIPTION = "Extracts OS Browser etc information from http user agent string"
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "python311-httpagentparser-1.9.5-1.1.noarch.rpm"
RPM_HASH = "86469b32919c37a0b9b4ab837847b4266864b715f38f5be4c1eed95fb3a132f54c15f7076b6879c39e41d5cb6e188815219f12631ce600bda1e71554fbde6ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpagentparser \
python3.11dist-httpagentparser \
python311-httpagentparser \
python3dist-httpagentparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
