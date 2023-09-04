SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python311-pexpect-4.8.0-13.1.noarch.rpm"
RPM_HASH = "6c3c27dce8cb7d6b07c400a365b161057a191f8894804bcc4cfa566eb25e3ae8fe231ddc378c17b4c90b39d1da898f2c29ba37ace3df7df89beffc03b9db9007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pexpect \
python3.11dist-pexpect \
python311-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python311-ptyprocess"

inherit rpm
