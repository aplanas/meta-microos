SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-schemaregistry-avroserializer-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "625b79cf506b9ea68f2ad5c7f1a5707454f578b7379dd3062656cedc6f702657918ceabe082f6db60729b0ef91bc4560587a5ff6fb5174ef3c4c9552bec5c43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-schemaregistry-avroserializer \
python310-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python310-avro \
python310-azure-core \
python310-azure-nspkg \
python310-azure-schemaregistry \
python310-msrest"

inherit rpm
