SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-schemaregistry-1.2.0-1.3.noarch.rpm"
RPM_HASH = "b5b1d0ea03be00691f11e272ab73676e217509ea83170a7d893a2c43bbe473f6979b1465bca33c84a357d6a5ad40f6c7eb77c4578d9aa6941e27140ffba6e453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry \
python3.10dist-azure-schemaregistry \
python310-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
