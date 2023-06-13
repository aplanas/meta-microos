SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-schemaregistry-avroserializer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "a2cb82e53b9a2eb696d42527531ac5cb4160e82de9be1ade0d8851a638b64db17642e7da0fa4b4c182000c2f43654714a3c45198443602a2af9771f9f9888751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroserializer \
python3.10dist(azure-schemaregistry-avroserializer) \
python310-azure-schemaregistry-avroserializer \
python3dist(azure-schemaregistry-avroserializer)"

RDEPENDS:${PN} += "python(abi) \
python310-avro \
python310-azure-core \
python310-azure-nspkg \
python310-azure-schemaregistry \
python310-msrest"

inherit rpm
