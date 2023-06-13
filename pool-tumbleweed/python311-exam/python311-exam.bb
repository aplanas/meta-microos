SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python311-exam-0.10.6-5.6.noarch.rpm"
RPM_HASH = "d9bf554d871b12296defc9fce34c59618f078d47b166c5034fa7c4dc725519d10d2a77b4e10e28898094c2be8122c6c6723ed58d249e35411d1d39312a026143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(exam) \
python311-exam \
python3dist(exam)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
