SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-schemaregistry-avroserializer-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "52348992f009fe0bc84745148f3feee68804e35a35ec0555daca5d76b5ec9546e5d1291b756b9ec452627a04d0bc4a3478eb86e31cf456060b2707028ecb7358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-schemaregistry-avroserializer \
python39-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python39-avro \
python39-azure-core \
python39-azure-nspkg \
python39-azure-schemaregistry \
python39-msrest"

inherit rpm
