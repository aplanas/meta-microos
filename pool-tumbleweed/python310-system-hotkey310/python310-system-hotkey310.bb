SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python310-system-hotkey310-1.0.5-1.5.noarch.rpm"
RPM_HASH = "d4ec5c8acc8f1653a993e9761b5ce954a7d13f4ac7345db5b5a3ba98db92f74184a8f54b5688049869b0510850247ce410de76f2563e1e10cd5d7c6fd96614a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-system-hotkey310 \
python310-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python310-xcffib \
python310-xpybutil"

inherit rpm
