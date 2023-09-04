SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pipx-1.2.0-2.1.noarch.rpm"
RPM_HASH = "aae983715c5373e557f50d7bae54d14bc26a3889f2147fd199d384f2967145c86fc8ef67aa3d7b789eba3fa5fb350e7cb992fa303c2fcf343038d079f9ba94d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipx \
python39-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-argcomplete \
python39-packaging \
python39-userpath"

inherit rpm
