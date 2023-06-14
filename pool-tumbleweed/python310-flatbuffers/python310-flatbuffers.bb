SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python310-flatbuffers-23.3.3-2.1.noarch.rpm"
RPM_HASH = "56e049ccc25bb4c926905420d42d992788c726472dba29899bdee2391b5fa429360e31f0f5a561e7a3bac78a3437988211dba6f653c0fc8654eab3cfff0a5414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatbuffers \
python3.10dist-flatbuffers \
python310-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
