SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "python310-jsonschema-spec-0.1.6-1.1.noarch.rpm"
RPM_HASH = "4a5e0406f28eed6e7166705934342e28dfb397532875ad34e150f5ddcf2684d176cbe738f27399d29e3e7a57b30a98030ea91d39e8b9ea0b567c2a422661ccf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema-spec \
python310-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.0.0 with python310-jsonschema < 4.18 \
python-abi \
python310-PyYAML \
python310-pathable \
python310-typing-extensions"

inherit rpm
