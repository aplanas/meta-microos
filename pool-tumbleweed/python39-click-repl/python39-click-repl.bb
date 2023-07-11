SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-click-repl-0.2.0-3.3.noarch.rpm"
RPM_HASH = "4ceb70e4b269980d72178da8a7f5c1efc3f218b22c1c8d1ca8afa5d373d2f9cf13e55061424442be2472a5f57d194f00bab992139515ae2d843f428a2a49fd16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-repl \
python39-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-prompt-toolkit \
python39-six"

inherit rpm
