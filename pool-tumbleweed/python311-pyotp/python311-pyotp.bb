SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python311-pyotp-2.8.0-1.5.noarch.rpm"
RPM_HASH = "6b3acb6464cb5dcb92ef854ec2f508a8ff83aa88016db9f3a57f45019a6c92c6c2b8b2c08849e94aa7c1576af1fc08767514028d78e0d422029990b4c388cbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyotp \
python3.11dist-pyotp \
python311-pyotp \
python3dist-pyotp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
