SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python310-exam-0.10.6-5.6.noarch.rpm"
RPM_HASH = "2b24346920af371ce50d3ebf8d7472123becb959e0c675d449ea519e38201198eb1dcd30a98ab4ec35f699e6ffba31e2602bce6af98547827793a77be149d3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exam \
python3.10dist-exam \
python310-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
