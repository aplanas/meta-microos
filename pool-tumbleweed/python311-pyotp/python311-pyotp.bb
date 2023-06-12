SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python311-pyotp-2.8.0-1.3.noarch.rpm"
RPM_HASH = "e718d4418675b7276874a9df6b0f7c02890d7c7ee53a969e76fb7237a100bdbfc8b4312ef081132ebf2ed6eafe00b91ef308db7208e8409a4fff1b8f01c12d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyotp) \
python311-pyotp \
python3dist(pyotp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
