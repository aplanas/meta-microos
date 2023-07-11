SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-pytest-responsemock-1.1.1-1.7.noarch.rpm"
RPM_HASH = "ee00fb6236b9c00d28214baad36fbdf4041e9adf6508005ffadb9e32a07d1100117cea11de37111e35ff9d7b8ee6d7b0b9db7bcbe935bb5494c606633a2cc3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-responsemock \
python3.11dist-pytest-responsemock \
python311-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-responses"

inherit rpm
