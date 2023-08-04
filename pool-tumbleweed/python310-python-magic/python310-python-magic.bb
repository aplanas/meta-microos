SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python310-python-magic-0.4.27-5.1.noarch.rpm"
RPM_HASH = "e1ca1b055499654a8634b0292e7256b05df5f653a863487e6df1c5219c0deddd063d1b0ffeed45b09ff7d87028029250bf8e039c8e48e8747736d04d9f2b1155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-magic \
python310-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
