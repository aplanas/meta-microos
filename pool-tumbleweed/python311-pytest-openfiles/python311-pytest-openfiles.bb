SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-openfiles-0.5.0-1.15.noarch.rpm"
RPM_HASH = "d62179e9033d1b1766e6ad1c50c99634590c1731c671a7bb1507e70ebc6b34937bb1f23cf74ade9112e3a62efe9ec28e5940f7a7379ce05113e0c92234c3ec49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-openfiles \
python3.11dist-pytest-openfiles \
python311-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
python311-pytest"

inherit rpm
