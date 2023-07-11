SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-loganalytics-0.1.1-1.9.noarch.rpm"
RPM_HASH = "a832789d5d240d0d23708db95e818fee48595c824513468a65aee329880295b8d30086f056ac4d2c62db3c5cfd6204d9d56f624318f0f6ce66dd17fa0fd119ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-loganalytics \
python310-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
