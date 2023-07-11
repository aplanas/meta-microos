SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-system_hotkey-1.0.3-1.17.noarch.rpm"
RPM_HASH = "9c2139bd33153b602d102e1e20b41bfd0d70db2683f128120401cf543a30e6a66a8a94988c8cd6dd6fcf5447b22a4be663d6a1657e8e583081c16b24e6601012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-system-hotkey \
python39-system-hotkey \
python3dist-system-hotkey"

RDEPENDS:${PN} += "python-abi \
python39-xcffib \
python39-xpybutil"

inherit rpm
