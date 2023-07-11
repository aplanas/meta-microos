SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python311-python-magic-0.4.27-4.3.noarch.rpm"
RPM_HASH = "b0e0216dcb7d452982e208c19421f9caa971dc80517670e74b480d092d6dbb6761a5b017af4b22845fe7cb966b3dc195206ef921f61c15dc22ffdcfe6dc00d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-magic \
python3.11dist-python-magic \
python311-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
