SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python39-pyotp-2.8.0-1.5.noarch.rpm"
RPM_HASH = "e59ff260fe779c2adabce3fdae754168b750051caac0f236e07dd97c3ed08ad492e3bf47a499383eb0186b5393e1888793db581d20bd4f659438cfc59fb04649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyotp \
python39-pyotp \
python3dist-pyotp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
