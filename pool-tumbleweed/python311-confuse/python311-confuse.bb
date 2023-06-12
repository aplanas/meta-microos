SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-confuse-2.0.1-1.1.noarch.rpm"
RPM_HASH = "d360825061a4502a1b250e8023e7bc3228e4a4cd5aaab64005dd8f18d53d82662ffef75a7c1ee7c3e1179e4a6e208a5a490787e51b7c772e389a55a6e2fe9b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(confuse) \
python311-confuse \
python3dist(confuse)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML"

inherit rpm
