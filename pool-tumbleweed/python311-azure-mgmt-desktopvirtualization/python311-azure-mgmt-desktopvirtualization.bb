SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-desktopvirtualization-1.0.0-1.2.noarch.rpm"
RPM_HASH = "23fade4f8163ddb0c3b4dbe24153a39bb67b6d0e9fb11ea214bab0d6d4765c8b8a107f5c457626c8b6137f59528918b0fb26493a1098f8a6155a48c2b1c05a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-desktopvirtualization) \
python311-azure-mgmt-desktopvirtualization \
python3dist(azure-mgmt-desktopvirtualization)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
