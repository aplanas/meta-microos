SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python311-pexpect-4.8.0-10.1.noarch.rpm"
RPM_HASH = "d09c3b10c79187bb1bfc0c600a34868bc3a191eb2a052505797acc3a57f433bdfe2b180e90dad76fe4349c4ea46bb895bb46c880a6d70ebc81ec0e1214e5ff9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pexpect) \
python311-pexpect \
python3dist(pexpect)"

RDEPENDS:${PN} += "python(abi) \
python311-ptyprocess"

inherit rpm
