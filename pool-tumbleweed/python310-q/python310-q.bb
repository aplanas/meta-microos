SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python310-q-2.7-1.3.noarch.rpm"
RPM_HASH = "9a2ed905203fc7a32e2747a84dbd800578f16b911d80241b472cda1554f65e11657adb9e83b98196b24f538e4d61bcf42433c78ac892b4d53a26b3fc558123b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-q \
python3.10dist-q \
python310-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
