SUMMARY = "User-Interface tools (mainly command-line)"
DESCRIPTION = "User-Interface tools (mainly command-line)"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-jaraco.ui-2.3.0-1.1.noarch.rpm"
RPM_HASH = "b303df75cbbd994afa5cb1049983fdd0c4c967af8e51c9bbfbd3304de3053713734e010b5c4e4f7a20a4992524063f4a44841cc42925c2c056ba41bfcc4f6ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.ui \
python310-jaraco.ui \
python3dist-jaraco.ui"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-jaraco.text"

inherit rpm
