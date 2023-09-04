SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "7.3.0"

RPM_NAME = "python39-pip-tools-7.3.0-1.1.noarch.rpm"
RPM_HASH = "04e11880a7b988c58622274955279fc55aa4226f90440452673b1a201542712a1e57132bccdd815bcc2337ac94c474358d3c560d97abae9b7238d899d217dbb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip-tools \
python39-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-build \
python39-click \
python39-pip \
python39-setuptools \
python39-tomli-w \
python39-wheel"

inherit rpm
