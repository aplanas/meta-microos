SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-schemaregistry-1.2.0-1.4.noarch.rpm"
RPM_HASH = "4552a4a3b47f826b70c18cbfadaa351acd4b8811ea5bfe5c316ef89611deecb000a38bb086227d00697c7238ed36136146bf395b618427b68a2c65fb94b0a4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-schemaregistry \
python310-azure-schemaregistry \
python3dist-azure-schemaregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
