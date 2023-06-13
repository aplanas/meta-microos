SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python310-click-default-group-1.2.2-2.8.noarch.rpm"
RPM_HASH = "a48fb44ad42cb00d15eb89a54ff03321c92a0bc5dab6d98365e55cf3de91b61324ed46987c13c64086ecee1c8b1463653cbbeb63627ae949f10de91c7578129e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-default-group \
python3.10dist(click-default-group) \
python310-click-default-group \
python3dist(click-default-group)"

RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
