SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python311-python-pseudorandom-0.2.2-3.8.noarch.rpm"
RPM_HASH = "65299c3b70d8d68cdce3640a64e65ec1c3422a18411db3e555f6921b05015ec72740b602214fc3c855ef3113d36a63eef4d79a9f3473f3d21b779116aa959ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pseudorandom \
python3.11dist-python-pseudorandom \
python311-python-pseudorandom \
python3dist-python-pseudorandom"

RDEPENDS:${PN} += "python-abi \
python311-python-datamatrix"

inherit rpm
