SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-loganalytics-0.1.1-1.9.noarch.rpm"
RPM_HASH = "930009e1e2c260b5c59808bba5aedab62ade22e0b8312fd912567502a775877aa93ba83cc7831a9fde7e16de779a18e9246dd6ee3d55918b14c7a74c76017e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-loganalytics \
python3.11dist-azure-loganalytics \
python311-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
