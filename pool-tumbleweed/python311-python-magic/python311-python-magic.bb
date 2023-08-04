SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python311-python-magic-0.4.27-5.1.noarch.rpm"
RPM_HASH = "f781b8d88ebdb10a2cd9faf36c764b5bab457737b4dc5e3ac55e88fd296d285b89f762c20feebf2408903459f09571f1acd08ee23066d345339b13415ef5d6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-magic \
python3.11dist-python-magic \
python311-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
