SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-format-nongpl-4.18.6-2.1.noarch.rpm"
RPM_HASH = "b39a5399e503d896eb622174789ffc3696ea6fad58aef54a1ab908373179fd34055734d0bb6535cc2fe9a1c872c1e1d2e0db421c0bccee4f4ca94335fb2e6157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format-nongpl"

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
