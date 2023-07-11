SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.13.0"

RPM_NAME = "python311-pip-tools-6.13.0-1.1.noarch.rpm"
RPM_HASH = "73c53b8581b5b26970060956c91fc1c9384b2343952ae362cded8050b3698fc2cbff4272ffb94f74c253485ce65328240fd42ed5868e01aeb185bc1cdd29c25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-tools \
python3.11dist-pip-tools \
python311-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-build \
python311-click \
python311-pip \
python311-setuptools \
python311-wheel"

inherit rpm
