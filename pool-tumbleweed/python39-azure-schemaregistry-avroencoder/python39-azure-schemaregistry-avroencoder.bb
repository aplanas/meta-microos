SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-schemaregistry-avroencoder-1.0.0-1.3.noarch.rpm"
RPM_HASH = "1202888d069cddacb2afc6e9419a4b5e189071a12f8a2caaf440254b0c9b6e60fded5ec039d09341d595ad5bfe06eb7285903e91320654568b8b5b086a1a1a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-schemaregistry-avroencoder) \
python39-azure-schemaregistry-avroencoder \
python3dist(azure-schemaregistry-avroencoder)"

RDEPENDS:${PN} += "python(abi) \
python39-avro \
python39-azure-nspkg \
python39-azure-schemaregistry \
python39-typing_extensions"

inherit rpm
