SUMMARY = "Python One Time Password Library"
DESCRIPTION = "PyOTP is a Python library for generating and verifying one-time passwords. It can be used to implement two-factor (2FA) \
or multi-factor (MFA) authentication methods in web applications and in other systems that require users to log in."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python310-pyotp-2.8.0-1.5.noarch.rpm"
RPM_HASH = "ea278bea8174a7f9ed93d06ad4c8ac89e7e6b23d1e6299dc490fe5ad737f74cd48a37a4a24ae7fe7d9a203d78bdedca5b752a906dc83dcee64fad6de2d4e424c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyotp \
python310-pyotp \
python3dist-pyotp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
