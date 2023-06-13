SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python38-azure-monitor-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "5a2cd75ca9dea8f0168f98e5419b58a5e22f7b40e3f35ea3a9d6fda5562c504e7b9176789f7bc90353c321b9e6db616be1d77899fde37c806bd12561f1e39f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-monitor-nspkg) \
python38-azure-monitor-nspkg \
python3dist(azure-monitor-nspkg)"

RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
