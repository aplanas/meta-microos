SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python310-pyotp-2.8.0-1.3.noarch.rpm"
RPM_HASH = "eef7248eb7260d3bafdce34d1cad5d39cf298223b4fd94a3a21bb13c594c9853a0ba95e09dfb89131c98d3cfb57d7c7fdc4cd066173ce56bf08d18d0a4e121b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyotp \
python3.10dist(pyotp) \
python310-pyotp \
python3dist(pyotp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
