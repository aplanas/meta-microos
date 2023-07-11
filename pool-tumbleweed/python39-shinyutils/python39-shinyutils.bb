SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-shinyutils-3.1.0-2.11.noarch.rpm"
RPM_HASH = "45bb440d2a2577e8f94e35622750c5de90b8935d3fa98edfaec0419356998f7f445221bc0b348c7a07842e3aa3f167e70a4eb209184d4dbe825581454fc4e3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shinyutils \
python39-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python39-crayons \
python39-matplotlib \
python39-seaborn"

inherit rpm
