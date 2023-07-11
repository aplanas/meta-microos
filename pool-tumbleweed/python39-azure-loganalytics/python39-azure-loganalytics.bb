SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-azure-loganalytics-0.1.1-1.9.noarch.rpm"
RPM_HASH = "c1c6f7182d56118719d003253b18f3d38d2e1ff1221b6c8704b11e5cea1e19fd6927799d32c2b9bf8b79ee335db51349cefe2f0926924c38585a44e9e483299d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-loganalytics \
python39-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
