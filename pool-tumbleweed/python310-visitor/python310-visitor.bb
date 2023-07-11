SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python310-visitor-0.1.3-1.20.noarch.rpm"
RPM_HASH = "8ea372f12a52198d98b06935549f5c9016a65a6c73c89cb64a130f794f88938793f1480ef4ff22df78916baeda32979a14c34acbdc8e1f38eed9a2afcdce5e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-visitor \
python310-visitor \
python3dist-visitor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
