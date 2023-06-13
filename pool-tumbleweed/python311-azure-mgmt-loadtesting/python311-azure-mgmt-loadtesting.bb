SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-loadtesting-1.0.0-1.3.noarch.rpm"
RPM_HASH = "f034f300959c24fc4400e1f03da70381923720208ade5528e320716fd2a5aa48ce8e9fa2b9d3b5ba775d289a363c7af9b217505b54ec25fb1f763f2599f9abb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-loadtesting) \
python311-azure-mgmt-loadtesting \
python3dist(azure-mgmt-loadtesting)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
