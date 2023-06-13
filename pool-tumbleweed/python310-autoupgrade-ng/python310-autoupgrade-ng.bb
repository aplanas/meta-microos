SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported; you can accomplish the same task calling:"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-autoupgrade-ng-0.3.0-3.15.noarch.rpm"
RPM_HASH = "0a76a642b556c19dbf270cf95988617cc5a265a9111aaae06c0ef92054d8cf8a4f85e16e1ea5e53f27e5a48aced4d76d9953dbb292b1ee2b9dd3e97a82417f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoupgrade-ng \
python3.10dist(autoupgrade-ng) \
python310-autoupgrade-ng \
python3dist(autoupgrade-ng)"

RDEPENDS:${PN} += "python(abi) \
python310-pip"

inherit rpm
