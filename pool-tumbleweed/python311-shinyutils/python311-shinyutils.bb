SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-shinyutils-3.1.0-2.9.noarch.rpm"
RPM_HASH = "05e8b444383a2a37a32676aacb35fe59af05402d2c6056a78847a052b70a72c496159f8cd7fa2e1fc57507a9f281f346ec1dc8d678f660b8f7c127183b57dc30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shinyutils) \
python311-shinyutils \
python3dist(shinyutils)"

RDEPENDS:${PN} += "python(abi) \
python311-crayons \
python311-matplotlib \
python311-seaborn"

inherit rpm
