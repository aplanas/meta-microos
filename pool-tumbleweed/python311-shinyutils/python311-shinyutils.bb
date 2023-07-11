SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-shinyutils-3.1.0-2.11.noarch.rpm"
RPM_HASH = "fb1b80ccb22115f881bc56f9952fc1ec2a6bc2aaa27468b6b6e868e2554329d6bee080a384c1bb5819ed022f2f5631c21d36fd06f98179a0cb0bd379553bc29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shinyutils \
python3.11dist-shinyutils \
python311-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python311-crayons \
python311-matplotlib \
python311-seaborn"

inherit rpm
