SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python310-python-editor-1.0.4-1.15.noarch.rpm"
RPM_HASH = "c43b346fc28e3c4cf9378ebfba80093452995e786e758cace751370ff39b9756bf51cec6536cfcc343e8bf67d73ce449d5a497f003f539f4c0e5905c6e839080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-editor \
python310-python-editor \
python3dist-python-editor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
