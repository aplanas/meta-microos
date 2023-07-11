SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-click-repl-0.2.0-3.3.noarch.rpm"
RPM_HASH = "7f3e191e2d3351f45f96e394db0984a700d57740d1a40eca5b995bd76a28e9f724a4a0d3ddedec3af5945802261cb09d83f49c77d7c81816e37f37b20cf9f9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-repl \
python310-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-prompt-toolkit \
python310-six"

inherit rpm
