SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-system_hotkey-1.0.3-1.17.noarch.rpm"
RPM_HASH = "6bfe8c8d199995a27c5a0c8ed52f9fe28e4ec5c16bedd8911f1dc570b843a688243fc6b2c0f5b9a9225085becae589c1bbada6017db4839f32d3174ebedf0650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system-hotkey \
python3.11dist-system-hotkey \
python311-system-hotkey \
python3dist-system-hotkey"

RDEPENDS:${PN} += "python-abi \
python311-xcffib \
python311-xpybutil"

inherit rpm
