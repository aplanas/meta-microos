SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-monitor-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "3efb7bc035bbb7b3890840fe8a7f017498e58cc9507f6f535657d7e6a3394d479729e97db91dd4cf62893b499e56838e1c68ec9d649f72e7eda8cd888f870553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-nspkg \
python3.11dist-azure-monitor-nspkg \
python311-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
