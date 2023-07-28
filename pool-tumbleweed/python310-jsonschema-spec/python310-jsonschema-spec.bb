SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.2.3"

RPM_NAME = "python310-jsonschema-spec-0.2.3-1.1.noarch.rpm"
RPM_HASH = "63a840c408092d10a95bbe5423e6a397319e4e63684a215d149b7b70c3d1f908519f6736b162cf27dba095c62e673d443cf1d4a03cffe9e1886e6cfd0a3c9a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema-spec \
python310-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-pathable \
python310-referencing"

inherit rpm
