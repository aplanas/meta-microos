SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python310-exam-0.10.6-5.8.noarch.rpm"
RPM_HASH = "75c40be89aa0debdcaaca522d33c4279f3537e68ccdd6da792204e87eafc921d130edd5b38e969999d472558c92b882c782b3846ec0de28eded3f8b09bf693cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-exam \
python310-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
