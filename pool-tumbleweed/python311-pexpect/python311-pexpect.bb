SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python311-pexpect-4.8.0-11.1.noarch.rpm"
RPM_HASH = "81efc0e1cd2bb13bc4f824e50854d9b3a2bc817639b289c6e75a4cdd485a6a67998db4a7464630d5e7495f528eaca67e9a2338c81696f85e74520de3c5f28d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pexpect \
python3.11dist-pexpect \
python311-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python311-ptyprocess"

inherit rpm
