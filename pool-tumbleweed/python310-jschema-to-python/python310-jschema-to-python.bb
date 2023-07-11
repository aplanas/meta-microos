SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python310-jschema-to-python-1.2.3-1.8.noarch.rpm"
RPM_HASH = "d12c9d5f5cbe08647b5ba09d03680ad7c1585c28619475d8eab8a00161effdef888ce09c35116b3c23dc9d38498c4ce6f28d19ff5de091d86a74ecbc8f67abea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jschema-to-python \
python310-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-jsonpickle \
python310-pbr"

inherit rpm
