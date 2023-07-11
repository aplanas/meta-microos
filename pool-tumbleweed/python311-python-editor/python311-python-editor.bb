SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python311-python-editor-1.0.4-1.15.noarch.rpm"
RPM_HASH = "d79c4ffbbb94222414f467ee77efaaabf844dc705cfcea979854bd0d62459d57b8148a731405a30063d8953a88a5a2db6bb5e287b984d3942f0f5bb437c3e0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-editor \
python3.11dist-python-editor \
python311-python-editor \
python3dist-python-editor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
