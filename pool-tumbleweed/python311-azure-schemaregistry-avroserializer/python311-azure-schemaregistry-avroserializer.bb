SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-schemaregistry-avroserializer-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "1b40cd9abec05a63617c5528febfea79a7ad4826f49c47e28e76746758d47b6901d9a15009d51a6cc2ca0f669dd7eb67f902e5372da7d4a377b4adb6d26bd581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroserializer \
python3.11dist-azure-schemaregistry-avroserializer \
python311-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python311-avro \
python311-azure-core \
python311-azure-nspkg \
python311-azure-schemaregistry \
python311-msrest"

inherit rpm
