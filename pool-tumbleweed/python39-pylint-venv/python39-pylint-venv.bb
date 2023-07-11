SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-pylint-venv-2.3.0-1.5.noarch.rpm"
RPM_HASH = "6ccd56151b99fae267bbd0c5f151736ab3c3aa257a9fd027bdef9ecb0e5005cf3aaf11e2bd9aabdb0f2c2f02af0e205fe1beede53d2fe6f41a3910910967fa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylint-venv \
python39-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
