SUMMARY = "Microsoft Azure Schema Registry Avro Serializer Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro serializer capable \
of serializing and deserializing payloads containing Schema Registry schema identifiers and \
Avro-encoded data."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-schemaregistry-avroserializer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "c9f5f2a6d3bcc4782720ffa7173634f1655a995282c420040010d397aed13490e23effa9d09101d8344f26d68b68f48fc3d00a6d4df2e62c5bd481e4c3d9743f"
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
