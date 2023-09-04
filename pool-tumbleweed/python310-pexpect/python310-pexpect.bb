SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python310-pexpect-4.8.0-13.1.noarch.rpm"
RPM_HASH = "39f7eae1bcd2b22b6bbfd8d07ee44c8bc8d99d438dedde7299ad68846412c0da9241dd32fe19fb5dbabfaafa3aa67cd9c0a60588e1e1bb40d08645d6dfe490fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pexpect \
python310-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python310-ptyprocess"

inherit rpm
