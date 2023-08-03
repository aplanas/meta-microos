SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python311-moto-all-4.1.13-1.1.noarch.rpm"
RPM_HASH = "7c3b33251ce3632ea6911fa92e6401e341b1958592b778a4e15a4fcdd08889a62bc3441c666b2139b6f3f15574784c5e78e9aa8baff5ca2f560f3363e2b585a5"
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
