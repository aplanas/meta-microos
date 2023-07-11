SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-redhatopenshift-1.2.0-1.4.noarch.rpm"
RPM_HASH = "d68d067ba586ad2848248eeec944da1822cbb58be1b51a0afca4b8445cf622666a3811f94c2e73132745d926ec3167b9234937b673931e7aaeb6c91430720498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redhatopenshift \
python3.11dist-azure-mgmt-redhatopenshift \
python311-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
