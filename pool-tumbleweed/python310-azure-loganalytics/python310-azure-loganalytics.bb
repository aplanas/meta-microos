SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-loganalytics-0.1.1-1.8.noarch.rpm"
RPM_HASH = "f6098dacee3beaacbac381cc4213ce9a30a133e4ba7e39f2fe9bcd1c1b8cdbe94469ea0ceeee62c3daf7d4d8e9b4fc6d4782a3cdb4a934a5b262911c9286d65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-loganalytics \
python3.10dist-azure-loganalytics \
python310-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
