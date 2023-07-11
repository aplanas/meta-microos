SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python311-system-hotkey310-1.0.5-1.5.noarch.rpm"
RPM_HASH = "dbcc5317ca868e1bf6ca6066696a3c19e8d10c134c80729e86cf1929b59ebc92e1dcb92c3febafc97a7a191488dd70282e2b074d08bdb07553144e3274952c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system-hotkey310 \
python3.11dist-system-hotkey310 \
python311-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python311-xcffib \
python311-xpybutil"

inherit rpm
