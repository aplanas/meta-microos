SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python311-qrcode-7.3.1-2.7.noarch.rpm"
RPM_HASH = "14e77ac1389b61d196382d14ea0f915bd31c2cbbf5b834cba78c942c1989583d595967dc43b1ce09276091b8f0fd7cd3aefbaa1a0f16f336b50c613b941f8555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qrcode) \
python311-qrcode \
python3dist(qrcode)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
