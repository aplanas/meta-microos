SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python39-PyMsgBox-1.0.9-1.3.noarch.rpm"
RPM_HASH = "8169c3937afcb97a6672598afab62206ad02f1f3152adec2ec2abf9a4184bc2c70bee3c36e141708b52b7284fa7648374ffa8706f314c64d26604a6257bb07dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymsgbox) \
python39-PyMsgBox \
python3dist(pymsgbox)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
