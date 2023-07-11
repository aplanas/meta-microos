SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-schemaregistry-1.2.0-1.4.noarch.rpm"
RPM_HASH = "e20000e5d4292ce4fc06e6c85c14a882650c3367cc4f44c49c34669f38a69c03cfdf6a3f832a78ae68d5aea2374ff4ac35b0ad3cbf3c43da1b6c4f477f7e6f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-schemaregistry \
python39-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
