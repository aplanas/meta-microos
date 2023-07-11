SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pipx-1.2.0-1.3.noarch.rpm"
RPM_HASH = "cccf7251ffe7840a66594aa0cbb4b4c0161aec8655118587d9511bf6e984148e4a490bdb3a96d5cee535295a0b896e0ff764bf38b2a414d808c98de5960d3ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipx \
python3.11dist-pipx \
python311-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-argcomplete \
python311-packaging \
python311-userpath"

inherit rpm
