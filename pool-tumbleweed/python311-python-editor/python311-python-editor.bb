SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python311-python-editor-1.0.4-1.14.noarch.rpm"
RPM_HASH = "b87a627f531a6c5a10c50ebea415169867c168c4cf268ed562695d65917669c942ab004a968a560d80b928c388a8117556cae09ec59680c2e649963c7049eb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-editor) \
python311-python-editor \
python3dist(python-editor)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
