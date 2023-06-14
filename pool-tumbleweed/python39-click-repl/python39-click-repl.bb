SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-click-repl-0.2.0-2.3.noarch.rpm"
RPM_HASH = "acc873c83ae2a464c4b7eca5faf6a1c5e5349e8f564bdeee951a8e90f65d068c73b494daeb440d7177439e3b64ee76cf8613f36f678cc42889ccf609b9c64832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-repl \
python39-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-prompt-toolkit \
python39-six"

inherit rpm
