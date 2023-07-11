SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python310-click-default-group-1.2.2-2.10.noarch.rpm"
RPM_HASH = "562fdd362af8f3ebd057d923bd8342208c55b89f111f0f8c244a62da15b6e41521164e296025fb561fa30e9dcd537301fbd75060bc9db680bb1c39db67e405a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-default-group \
python310-click-default-group \
python3dist-click-default-group"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
