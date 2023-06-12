SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-Flask-Mail-0.9.1-3.6.noarch.rpm"
RPM_HASH = "838e060c6822850d0ccf7a321b0a208a07c3431a88f0c047738d4ec40cb12cd136c2a0cbd9e1bb49b93aad7fc6c1be86ee3a3f07d3a8fd9627438ac3c0b0ac21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-mail) \
python311-Flask-Mail \
python3dist(flask-mail)"
RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-blinker"

inherit rpm
