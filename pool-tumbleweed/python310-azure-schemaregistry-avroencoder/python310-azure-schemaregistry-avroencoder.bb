SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-schemaregistry-avroencoder-1.0.0-1.3.noarch.rpm"
RPM_HASH = "32ce54a871fa84f68a6260f259d4706e88a257196140fc9012a7956b321a81ed08882420bd4a83e2974510d90a5114b477b348ac5e0655ac3a3bba2f27b23ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroencoder \
python3.10dist-azure-schemaregistry-avroencoder \
python310-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "python-abi \
python310-avro \
python310-azure-nspkg \
python310-azure-schemaregistry \
python310-typing-extensions"

inherit rpm
