SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-autoupgrade-ng-0.3.0-3.16.noarch.rpm"
RPM_HASH = "bedf1c3c50ce2af2c31ff34e4f91986a54c0b9f65956485324ca9ffb080faa3a9769995d7ae547b7a4df61e5281a11b06ae54eb5fda0a82e0b78197bf4cc7388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoupgrade-ng \
python3.11dist-autoupgrade-ng \
python311-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python311-pip"

inherit rpm
