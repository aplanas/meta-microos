SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-autoupgrade-ng-0.3.0-3.15.noarch.rpm"
RPM_HASH = "ed0a80ba390224eb6280579547defddef8b96f8e19553faaa04adcce259955869f23ed08df55db4511a971995d6c06192e49237185f1907d5efa52d274576ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-autoupgrade-ng \
python311-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python311-pip"

inherit rpm
