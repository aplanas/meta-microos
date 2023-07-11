SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python311-jaraco.logging-3.1.2-2.2.noarch.rpm"
RPM_HASH = "343995d534f86b1f8d9f69fd5964054501315b37610e9f02a077d75f09a01b39ba7a5f7f7d33e9b62ecf7db9ff88583e91d08bf4960a21e792698f2f1ba51a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.logging \
python3.11dist-jaraco.logging \
python311-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python311-tempora"

inherit rpm
