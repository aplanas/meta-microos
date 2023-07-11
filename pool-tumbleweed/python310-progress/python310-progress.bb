SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python310-progress-1.6-1.9.noarch.rpm"
RPM_HASH = "b055b527af710ec88558ae8aa71603df54a16e97746e368d14f034b581a824c630683a13988280acb8c1d734ab3bc5229ec3e291a7d10ed2b746c6073097eba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-progress \
python310-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
