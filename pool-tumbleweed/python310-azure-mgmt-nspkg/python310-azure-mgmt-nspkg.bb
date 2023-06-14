SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-azure-mgmt-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "35ff3230b8d628e92d2700fab60b9058ff5eda0c1fdf0c382627a015d85c6d3092487ce9e96d06b364c5dcb75f8ef5700bcab512e746e274bfcc30d8085f3e34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nspkg \
python3.10dist-azure-mgmt-nspkg \
python310-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
