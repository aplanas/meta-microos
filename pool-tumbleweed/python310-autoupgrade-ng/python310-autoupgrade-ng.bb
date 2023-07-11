SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-autoupgrade-ng-0.3.0-3.16.noarch.rpm"
RPM_HASH = "8a1ba6a26a108afb98518b9b0249e6f708c2a74323e25e4bab796ec70f43ec66afdfb9f84a42be9b1fd379518f5999a98fb223b8df58a02d4966fdaee4cd93da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autoupgrade-ng \
python310-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python310-pip"

inherit rpm
