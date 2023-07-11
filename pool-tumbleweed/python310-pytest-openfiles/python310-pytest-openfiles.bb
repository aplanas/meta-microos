SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-openfiles-0.5.0-1.15.noarch.rpm"
RPM_HASH = "8020378ac3a3796364ddd447298ad10fe6346d103a24574319764c3a9d5649b1ffef07fcb5061b4b7dffda8f593f9b348b3540d86c0184e3f1b87c70dec21892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-openfiles \
python310-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python310-psutil \
python310-pytest"

inherit rpm
