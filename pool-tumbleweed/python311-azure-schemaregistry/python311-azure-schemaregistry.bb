SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-schemaregistry-1.2.0-1.4.noarch.rpm"
RPM_HASH = "4388859818d094ea6596acad5eaaacad52be98bc10d9edd8c00bca85102b10d7647e7c3f24769ec0e74c9714dde89685ffe2e1fa0a72e9a55195391a8ba77606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry \
python3.11dist-azure-schemaregistry \
python311-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
