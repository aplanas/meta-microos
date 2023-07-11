SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-pywal-3.3.0-1.14.noarch.rpm"
RPM_HASH = "b514a3a733b3436e92b3daf13983c6a36223e532f23b9570fcad1d3a638b74440fb0cee2f8006c14824d17f043b4ff383357d9ec69c73b002bfb423aa45db1c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywal \
python310-pywal \
python3dist-pywal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
