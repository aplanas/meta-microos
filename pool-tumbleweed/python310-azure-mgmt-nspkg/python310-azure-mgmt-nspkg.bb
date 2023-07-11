SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-azure-mgmt-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "ca03f2e4ff5e39dd696ed5dfa6fa08cf2aa3f11d450fe08edb8297393a9f93b5eaf22aa1e5a5d6a4b1cb213c0aec2e451a89e09f87534e8efea963f13e90c374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-nspkg \
python310-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
