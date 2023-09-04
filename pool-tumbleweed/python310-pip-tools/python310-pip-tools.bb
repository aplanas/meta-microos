SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "7.3.0"

RPM_NAME = "python310-pip-tools-7.3.0-1.1.noarch.rpm"
RPM_HASH = "986516d478c1b7a71f758ff8e9166986f635feb314d256f2b04d56ba5ee9c6138e5b07c3f958faee5dd624d963690b3bcbdb87ecc3d9100ad37ae718fe8f5d9b"
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
python310-tomli-w \
python310-wheel"

inherit rpm
