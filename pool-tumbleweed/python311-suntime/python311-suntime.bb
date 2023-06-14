SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python311-suntime-1.2.5-1.14.noarch.rpm"
RPM_HASH = "ef8cfbed62ba07e0392e83a73b346c0a2b877630a7c8ef3e7f5350cdff4b71d8bd281737b4a361171392ca318692a77894db8d44926e82b23a2021eb6b3d672a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-suntime \
python311-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
