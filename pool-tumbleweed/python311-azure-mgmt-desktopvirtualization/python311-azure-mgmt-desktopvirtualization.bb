SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-desktopvirtualization-1.0.0-1.3.noarch.rpm"
RPM_HASH = "f6a57b57b56336e1751301ab8721d697867394feed403fb76ddaac1b8dd85479039f2da34ceefb266ac862f923c04a81954076432f02cf19196ee2b564c39d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-desktopvirtualization \
python3.11dist-azure-mgmt-desktopvirtualization \
python311-azure-mgmt-desktopvirtualization \
python3dist-azure-mgmt-desktopvirtualization"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
