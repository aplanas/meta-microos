SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-monitor-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "c08b4ca8560b3770008bc3fccd8a52960e294660fca9e8fa9ccbd4e169739699f8f4d79be9632d6ad6d410090bc47902f88132261e91db0bb450e3f956338816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-monitor-nspkg \
python39-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
