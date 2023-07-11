SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python310-nodeenv-1.7.0-1.7.noarch.rpm"
RPM_HASH = "65f43d02b0758be4f2ee8267f784e7f56ea22243ad5a78d5565dd5ccace6fbb7e674f435a799f0e7142a4cdfed882e20509a7209b7b0c62a9bf0b8ef878da5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nodeenv \
python310-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
