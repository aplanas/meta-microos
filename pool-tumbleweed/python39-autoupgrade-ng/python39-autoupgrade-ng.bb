SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-autoupgrade-ng-0.3.0-3.15.noarch.rpm"
RPM_HASH = "e65a5c74ed5ea35c6c5626c29750168812b0234bd1204e75de4547b1ea5457f9dbec95939bd8cac95550e057d886e6ddae6eb6da1309674d654daf93fa1a3801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autoupgrade-ng \
python39-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python39-pip"

inherit rpm
