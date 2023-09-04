SUMMARY = "A lightweight console printing and formatting toolkit"
DESCRIPTION = "A lightweight console printing and formatting toolkit."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "python311-wasabi-1.1.1-1.1.noarch.rpm"
RPM_HASH = "e26caeb76c5c271541a06082ed2c3dfad95280790743e2d1ac89b080c9174547a6ff2625e61f0595f0a78d5123009fc323376f5581a7330ab5833be3f649d925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wasabi \
python3.11dist-wasabi \
python311-wasabi \
python3dist-wasabi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
