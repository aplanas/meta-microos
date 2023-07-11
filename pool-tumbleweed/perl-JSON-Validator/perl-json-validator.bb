SUMMARY = "Validate data against a JSON schema"
DESCRIPTION = "JSON::Validator is a data structure validation library based around at \
https://json-schema.org/. This module can be used directly with a JSON \
schema or you can use the elegant DSL schema-builder JSON::Validator::Joi \
to define the schema programmatically."
LICENSE = "Artistic-2.0"

PV = "5.14"

RPM_NAME = "perl-JSON-Validator-5.14-1.2.noarch.rpm"
RPM_HASH = "696303bde7a7aa34ceb76a91ac1dd8f16fc50114b1b205bc700c994e4a53e98b6e07738780075569370c515ee58aaef41e804815fad0c62847cb93f6f9e1e256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--Validator \
perl-JSON--Validator--Error \
perl-JSON--Validator--Formats \
perl-JSON--Validator--Joi \
perl-JSON--Validator--Schema \
perl-JSON--Validator--Schema--Draft201909 \
perl-JSON--Validator--Schema--Draft4 \
perl-JSON--Validator--Schema--Draft6 \
perl-JSON--Validator--Schema--Draft7 \
perl-JSON--Validator--Schema--OpenAPIv2 \
perl-JSON--Validator--Schema--OpenAPIv3 \
perl-JSON--Validator--Store \
perl-JSON--Validator--URI \
perl-JSON--Validator--Util \
perl-JSON-Validator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--Util \
perl-Mojolicious \
perl-YAML--XS"

inherit rpm
