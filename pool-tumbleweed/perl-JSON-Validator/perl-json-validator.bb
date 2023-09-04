SUMMARY = "Validate data against a JSON schema"
DESCRIPTION = "JSON::Validator is a data structure validation library based around at \
https://json-schema.org/. This module can be used directly with a JSON \
schema or you can use the elegant DSL schema-builder JSON::Validator::Joi \
to define the schema programmatically."
LICENSE = "Artistic-2.0"

PV = "5.14"

RPM_NAME = "perl-JSON-Validator-5.14-1.3.noarch.rpm"
RPM_HASH = "b167440224435450cd8b55023423619c9d67b0054813a67a9a29f36334083aea19fac0f2bc7347066dd8953c5569c7a97a00f3d4c1df1ac8699eb001115bde82"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--Util \
perl-Mojolicious \
perl-YAML--XS"

inherit rpm
