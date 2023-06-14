SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-azure-loganalytics-0.1.1-1.8.noarch.rpm"
RPM_HASH = "15bafbaa480829ccb414da26f39f33c3d47086d906568a886e243f2c7a3f1bff5805c56740ca8caa1057df5f6654449c43b2148c1d060d6f9fcacd23ae55c291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-loganalytics \
python311-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
