SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-click-repl-0.2.0-2.3.noarch.rpm"
RPM_HASH = "0b9c3c3789b1408d733669b4f81cffea58d8869c10d88a507bf44bddea47067f73903e66731e6dc0564398f2e47b37a01387968174eea746889a9ffd1353305e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-repl) \
python311-click-repl \
python3dist(click-repl)"

RDEPENDS:${PN} += "python(abi) \
python311-click \
python311-prompt_toolkit \
python311-six"

inherit rpm
