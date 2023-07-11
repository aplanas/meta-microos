SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python39-python-editor-1.0.4-1.15.noarch.rpm"
RPM_HASH = "9c61dd87ce1ec1e493926b085d133a5145cd117ba82957ab55fb5b3eb3890db18ab8a33c4074d55b252d9d1b51377b020756a33619e861c33fa40e6384f1ef60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-editor \
python39-python-editor \
python3dist-python-editor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
