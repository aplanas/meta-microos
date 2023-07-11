SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python39-pexpect-4.8.0-10.3.noarch.rpm"
RPM_HASH = "777e230613bd2ab2047157c84e17b29e9ab6dc0c05564ef1a2be7084c252854afe4492474b7ce975b4e16666c290b02c2760bc61c388c2356c7e5e335f11c622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pexpect \
python39-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python39-ptyprocess"

inherit rpm
