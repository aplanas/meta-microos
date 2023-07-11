SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-schemaregistry-avroencoder-1.0.0-1.5.noarch.rpm"
RPM_HASH = "01d2f630f36a25e75f29f37147b914ffd4dc00658e83602fb4c550ef1d6a621490fbcb1b2c866e582e90fe6a15d4caa5e1014bc477c9ba54d3226096970bfdeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-schemaregistry-avroencoder \
python310-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "python-abi \
python310-avro \
python310-azure-nspkg \
python310-azure-schemaregistry \
python310-typing-extensions"

inherit rpm
