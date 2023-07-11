SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-all-4.1.0-1.7.noarch.rpm"
RPM_HASH = "cb92c58d33f98e3fa83580ad5279d094508dfb83ee68f11a6ea8f644f5babf21efbba41705e8b27ae14ca28e1c6db2e58091f73b498e13fa91e3a37e6a42e9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-all \
python311-moto-all"

RDEPENDS:${PN} += "python311-PyYAML \
python311-aws-xray-sdk \
python311-cfn-lint \
python311-docker \
python311-graphql-core \
python311-idna \
python311-jsondiff \
python311-moto \
python311-openapi-spec-validator \
python311-pyparsing \
python311-python-jose \
python311-setuptools \
python311-sshpubkeys"

inherit rpm
