SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-schemaregistry-avroencoder-1.0.0-1.5.noarch.rpm"
RPM_HASH = "4fe124b2f3272c4dc1035464c5fd94edc5359d2003c16300559171808164fe1aa336e3683029b1fda3ed5b8834ce86483e3bb55593913f72b993d832ae090e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-schemaregistry-avroencoder \
python3.11dist-azure-schemaregistry-avroencoder \
python311-azure-schemaregistry-avroencoder \
python3dist-azure-schemaregistry-avroencoder"

RDEPENDS:${PN} += "python-abi \
python311-avro \
python311-azure-nspkg \
python311-azure-schemaregistry \
python311-typing-extensions"

inherit rpm
