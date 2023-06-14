SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-schemaregistry-avroserializer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "9b23df1207f4f9675a752202be1543760ab17320b93f8199f6bb131c594499eb0487457104db81912bf802d81207a13aa438f5fa9b339c9cc07eee20e4943502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-schemaregistry-avroserializer \
python311-azure-schemaregistry-avroserializer \
python3dist-azure-schemaregistry-avroserializer"

RDEPENDS:${PN} += "python-abi \
python311-avro \
python311-azure-core \
python311-azure-nspkg \
python311-azure-schemaregistry \
python311-msrest"

inherit rpm
