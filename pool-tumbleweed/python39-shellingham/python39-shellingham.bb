SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python39-shellingham-1.5.0-2.3.noarch.rpm"
RPM_HASH = "28b1253dac63910e3b228098d0ef62ce595e0d0295a8a9a921f0374bd804864bb1a92a71a9d1db9eb21d695d829650407bb969ca15481c2381208d471e369fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shellingham \
python39-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
