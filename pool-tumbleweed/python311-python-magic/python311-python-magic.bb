SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python311-python-magic-0.4.27-4.1.noarch.rpm"
RPM_HASH = "60b6f2dfd9a530d098489024ea6b1fc6ad4c7a7c20a567862ad768254451a136266aec68673071a84a9f90c4f45f6a56f9c0de12f3c30efbabd4b309805b4d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-magic \
python311-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
