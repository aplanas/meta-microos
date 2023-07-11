SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python310-python-magic-0.4.27-4.3.noarch.rpm"
RPM_HASH = "c9e2319bfcbca1ae5e24c01ff8dc9af29cc0cdc881cfd1b12b8af5f262bf6befdc15356d6751b558677f93c81542c40a702ef0ca9e083cfcc4877cc6eaadd1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-magic \
python310-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
