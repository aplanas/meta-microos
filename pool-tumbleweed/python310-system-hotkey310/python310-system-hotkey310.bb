SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python310-system-hotkey310-1.0.5-1.3.noarch.rpm"
RPM_HASH = "a7f111b26adf2a2ff3a9938c8de38b3ae1e6410fc6f0b5a922d5498a17b2849402ba175d86835b9eb867deef03a1a944c1c305c2465065403252a01e1b8db6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system-hotkey310 \
python3.10dist-system-hotkey310 \
python310-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python310-xcffib \
python310-xpybutil"

inherit rpm
