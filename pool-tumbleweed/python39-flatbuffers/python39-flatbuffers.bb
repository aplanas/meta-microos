SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python39-flatbuffers-23.3.3-2.2.noarch.rpm"
RPM_HASH = "e54d6c7e10762d5828770e26f603d2fda5d253d021e25585bc1954bb343bd7df9b96d963b912a381b6d71cbd3e2ff72afd71e0046fe720abcae0a7a809a2bfb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flatbuffers \
python39-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
