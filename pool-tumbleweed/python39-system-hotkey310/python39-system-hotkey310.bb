SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python39-system-hotkey310-1.0.5-1.5.noarch.rpm"
RPM_HASH = "35e0cb9111d32219ffe48736959e34196b22c84c2d7e6179556a31be45f1b3e22517b7b99e2075d3dca84c42164c5a8d0a3fadce9d5a591357c3e897c1be7477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-system-hotkey310 \
python39-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python39-xcffib \
python39-xpybutil"

inherit rpm
