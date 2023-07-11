SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-schemaregistry-avroencoder-1.0.0-1.5.noarch.rpm"
RPM_HASH = "e42b768dda7a14af05ca69a4e6da4a7569b1bf4ff8194e8c6300ea919f848db797a4ab2edfca2c12d698ceef18763c15277d56ad8c3193c0f42e899df03e772a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-schemaregistry-avroencoder \
python39-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "python-abi \
python39-avro \
python39-azure-nspkg \
python39-azure-schemaregistry \
python39-typing-extensions"

inherit rpm
