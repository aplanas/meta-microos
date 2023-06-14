SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-desktopvirtualization-1.0.0-1.2.noarch.rpm"
RPM_HASH = "425041fb93874bbbe313130adb9e1bac34e235a4e1d58d89fb010715955ddf0fd000155077359ebd5a0f2306efd9dbc139ad436caf749f401742d2365664f437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-desktopvirtualization \
python3.10dist-azure-mgmt-desktopvirtualization \
python310-azure-mgmt-desktopvirtualization \
python3dist-azure-mgmt-desktopvirtualization"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
