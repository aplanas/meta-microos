SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-monitor-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "2c50ddc8fb8ec2f864b2a2fff50ca2a1d6e9b7948f844b6221a0c50d895489d0c981c3e77f9c7c46caec0c156b97a048d26bb4cea53d86879e8b8d7e75655eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-monitor-nspkg \
python310-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
