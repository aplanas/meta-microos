SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python39-system-hotkey310-1.0.5-1.3.noarch.rpm"
RPM_HASH = "e0382bfd901f727c3f81c501ee837330f5adde024cd6adf036b91c46bebb8845918baef4a09ee5301dae10a0bada70edd11cd26d1b16a09344645206055b5dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-system-hotkey310 \
python39-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python39-xcffib \
python39-xpybutil"

inherit rpm
