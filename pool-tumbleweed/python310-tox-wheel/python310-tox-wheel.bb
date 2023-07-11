SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python310-tox-wheel-1.0.0-1.5.noarch.rpm"
RPM_HASH = "5ef868a952aacdc191dde9d0852bf71c51b33e80efa70169d2fcd73e491847649158f7f24eaf34b2a57a3a9e907331339946cb9d70931c574902a97fbfd426ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tox-wheel \
python310-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python310-tox \
python310-wheel"

inherit rpm
