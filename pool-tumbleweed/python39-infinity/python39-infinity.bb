SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python39-infinity-1.5-2.5.noarch.rpm"
RPM_HASH = "27be1c4cd03258e5aedd9a816824af02d523d8e79e124e655d6bc14354a6af3c0d3379b166ab000cd365ae51cd236e4cb5c6dbf8d926356cb618629d9219dc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-infinity \
python39-infinity \
python3dist-infinity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
