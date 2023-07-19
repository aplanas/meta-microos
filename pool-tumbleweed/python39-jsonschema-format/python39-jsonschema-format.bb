SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python39-jsonschema-format-4.18.3-1.1.noarch.rpm"
RPM_HASH = "b65e224049fdff9cce468e4c8272950828bf739c23ee7f08fca551530597ab0d3c68e69fa7a5fb8ade8129c181f26fe8bb95306fd99609ead751c5b4ce888f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3987 \
python39-uri-template \
python39-webcolors"

inherit rpm
