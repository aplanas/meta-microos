SUMMARY = "CLI time tracker"
DESCRIPTION = "Watson helps managing time. It can tell how much time was spent on projects. \
It generates reports for clients."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-2.1.0-1.5.noarch.rpm"
RPM_HASH = "7c3a21290237565a22664225e773159b1c135d5a520f3a9227dd5fcc4d875c3bf19f03608cfc99e548553a6d841a2c40eda6ae5c44168b95f11a05fc91ad732a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-td-watson \
python3dist-td-watson \
watson"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-arrow \
python3-click \
python3-click-didyoumean \
python3-requests"

inherit rpm
