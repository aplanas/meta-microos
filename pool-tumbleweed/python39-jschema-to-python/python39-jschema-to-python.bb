SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python39-jschema-to-python-1.2.3-1.8.noarch.rpm"
RPM_HASH = "dadf3903e5d4b0065afee3d116411b6521c8944bc6bfca5cecdab4a072308886579bd3296b2830bb86b08adf9c91180ef63dd81640b8f4e4a00490ded3e86d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jschema-to-python \
python39-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-jsonpickle \
python39-pbr"

inherit rpm
