SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-system_hotkey-1.0.3-1.15.noarch.rpm"
RPM_HASH = "f704ae169abd5f594e4f6e1a809ee7d032dd456369917e32af4e5d001872b625b850a5b522486a0ed9b3bcccee90d23ccca48ae8368cfc926b010c43fa031e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system_hotkey \
python3.10dist(system-hotkey) \
python310-system_hotkey \
python3dist(system-hotkey)"
RDEPENDS:${PN} += "python(abi) \
python310-xcffib \
python310-xpybutil"

inherit rpm
