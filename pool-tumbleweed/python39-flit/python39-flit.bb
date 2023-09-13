SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-flit-3.9.0-1.1.noarch.rpm"
RPM_HASH = "43bfeafc1f66c32c5f7e0dd4cdc5cc6aaba514a6763734af8b0a4f6e7a577e727cfa4ff3031714ff70ac59f95fcc97aa14a3bd03b586c4fddf5a6e191d3a17a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit \
python39-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-flit-core \
python39-requests \
python39-tomli-w \
update-alternatives"

inherit rpm
