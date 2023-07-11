SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python311-shellingham-1.5.0-2.3.noarch.rpm"
RPM_HASH = "b82b9b752d1b29c95e1a49529b60a3e2a76f233229eb1c2439fb66129eab583e32dbf7927af45307670899b43f5f3e29c580628329721cdba78e612d01b49e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shellingham \
python3.11dist-shellingham \
python311-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
