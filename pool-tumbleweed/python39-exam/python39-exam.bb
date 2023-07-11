SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python39-exam-0.10.6-5.8.noarch.rpm"
RPM_HASH = "51b5c5130d0211c15c8b23eefd7b0c73919c3ad640f3d21bc94f1110e9650e0ccf54317ae45be3a8b83e64f2d71bc8deff365b50656af612e01e43bd7bb6c5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-exam \
python39-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
