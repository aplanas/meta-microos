SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-monitor-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "ac3975d7bf2bf11e23c3dd1fa377cbeea549415cd2a7c2adbbd55192db874cb4741ac18f115ec2eddd677dd8be67060110e0cf4e4fd7b9bd6387d53f5f751338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-nspkg \
python3.10dist-azure-monitor-nspkg \
python310-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
