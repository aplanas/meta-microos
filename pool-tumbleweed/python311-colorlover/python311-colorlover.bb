SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-colorlover-0.3.0-1.16.noarch.rpm"
RPM_HASH = "340c3311fd1b1321a606e3ef770676493572da40750d5988a8e673476ee7ee39cc711785a4d61d8418c02d2885a1cc0ed5e4582e0af1b238420f37262c475f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorlover \
python3.11dist-colorlover \
python311-colorlover \
python3dist-colorlover"

RDEPENDS:${PN} += "python-abi"

inherit rpm
