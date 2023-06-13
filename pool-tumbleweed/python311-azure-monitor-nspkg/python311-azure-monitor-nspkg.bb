SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-monitor-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "8d0f15435d526c70b9d2329b099a30d2895f0bd393fd617c7e19803240e08c64eaf2d57d7ffb7ee46d86d07d418810820841109d6e32918a3778ff6a64e64cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-monitor-nspkg) \
python311-azure-monitor-nspkg \
python3dist(azure-monitor-nspkg)"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
