SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python39-python-magic-0.4.27-4.1.noarch.rpm"
RPM_HASH = "40288d8acdc7ef21d9bc0557a7d7b5379f0dde827cfdb9da175f05025e4ab6f692f69d7362d213b6a62ba2b77593130750c4fd08e83938c068acf0983867c32b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-magic) \
python39-python-magic \
python3dist(python-magic)"

RDEPENDS:${PN} += "file \
python(abi)"

inherit rpm
