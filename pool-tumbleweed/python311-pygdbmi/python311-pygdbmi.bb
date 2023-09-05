SUMMARY = "Parse gdb machine interface output with Python"
DESCRIPTION = "Parse gdb machine interface output with Python"
LICENSE = "MIT"

PV = "0.11.0.0"

RPM_NAME = "python311-pygdbmi-0.11.0.0-1.1.noarch.rpm"
RPM_HASH = "9c42ef7041591c9245c4944f4b897e83be6e194e56b10285cc476a2dd709a4b857209f283b00176c80a92a8a9a851f5c3d2fa361f7318e17da7ab4ca906cecbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygdbmi \
python3.11dist-pygdbmi \
python311-pygdbmi \
python3dist-pygdbmi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
