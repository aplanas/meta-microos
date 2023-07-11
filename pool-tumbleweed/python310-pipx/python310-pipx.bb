SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pipx-1.2.0-1.3.noarch.rpm"
RPM_HASH = "853ca2ca2ce3f7b3b6316bb61c35446555a789432adb97bcdfce1498b27c0ec2f690e5735427fbb0559a57dd4940434eac87309a09b869b7b43ade2c4d297e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pipx \
python310-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-argcomplete \
python310-packaging \
python310-userpath"

inherit rpm
