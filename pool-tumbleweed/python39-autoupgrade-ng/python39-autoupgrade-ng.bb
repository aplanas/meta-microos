SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-autoupgrade-ng-0.3.0-3.16.noarch.rpm"
RPM_HASH = "9fe2aa6eefe02bfe2928d8fc285d64d6f60a37596821bd11add51f250199e4c2f25aea7bd144218a5f8bcdf388883c6612911850b841578cc362ac69d622db0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autoupgrade-ng \
python39-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python39-pip"

inherit rpm
