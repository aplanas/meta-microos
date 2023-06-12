SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python39-pyotp-2.8.0-1.3.noarch.rpm"
RPM_HASH = "de98fb371a2be01988b88d95edf81afdc8e19830222ad16302412a91c70f2bf97b5de010b889da277918dfde02883bb9fe9fb3c086cd7e5ccd0ed98ac4bfb3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyotp) \
python39-pyotp \
python3dist(pyotp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
