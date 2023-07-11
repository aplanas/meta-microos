SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.13.0"

RPM_NAME = "python310-pip-tools-6.13.0-1.1.noarch.rpm"
RPM_HASH = "5525d314565d50b79fcf4ef51c5116fc7836b995d6395015e558092c2f566de86be691bb7cf7967f086635b351a5a7daf077e971cb32d83d8812a37410285e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip-tools \
python310-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-build \
python310-click \
python310-pip \
python310-setuptools \
python310-wheel"

inherit rpm
