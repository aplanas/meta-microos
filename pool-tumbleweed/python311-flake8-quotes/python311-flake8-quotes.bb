SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python311-flake8-quotes-3.3.2-1.5.noarch.rpm"
RPM_HASH = "22d4c8704d30d2649ad29dc645e837056294287eef9f210d67d2e2b0fac6d1db52c1b5eeeab7ca1ee527e39273f7bc99157aaf5b569902cdca3c71cee1137aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-quotes \
python3.11dist-flake8-quotes \
python311-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
