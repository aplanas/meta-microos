SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python39-exam-0.10.6-5.6.noarch.rpm"
RPM_HASH = "d3466bf1739bf20dcc18d5c9d79e7cd148cf6243a19bd4464cc5cb23a30e255930407b5bbbcbadaae9ce76af24293e6f44c7a2468393a8f324d2f7095c7a6efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(exam) \
python39-exam \
python3dist(exam)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
