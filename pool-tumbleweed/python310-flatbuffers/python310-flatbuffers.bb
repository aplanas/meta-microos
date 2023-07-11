SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python310-flatbuffers-23.3.3-2.2.noarch.rpm"
RPM_HASH = "f1e271d79bbf786cb089882ef506a2f6c69b57a5edb108a9cf4e76d1ada9f8f326c6a4a51f53ded6b43cf53396960521cd9f65b330a059bc0da8501e85f61465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flatbuffers \
python310-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
