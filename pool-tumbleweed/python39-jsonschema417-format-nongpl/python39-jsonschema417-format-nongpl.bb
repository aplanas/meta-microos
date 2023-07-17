SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema417-format-nongpl-4.17.3-1.1.noarch.rpm"
RPM_HASH = "6f93695d30c8a0885a597c28b2efc2ab7b9826c9f37c771e2cb7a09f5c29dd7ebd59d5fb28953778bb267fb12d46f4deb76e259aa4eb1328f32dd96101f2063a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format-nongpl \
python39-jsonschema417-format-nongpl"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-uri-template \
python39-webcolors"

inherit rpm
