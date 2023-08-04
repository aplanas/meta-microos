SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python39-python-magic-0.4.27-5.1.noarch.rpm"
RPM_HASH = "5285cacad6f9b14420db8290cd7d6f80e0786972cf02a427757c0c30736d4cf533493f27e010724f226a8f29740ed8213499b1bc7a2f8c2eeaf781f2dc8eeb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-magic \
python39-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
