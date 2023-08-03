SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python39-moto-all-4.1.13-1.1.noarch.rpm"
RPM_HASH = "e8f17ad363ffd33bf85c83e6dccdaccdc977248a475fcc75aa8826ec883799f6632d5b41d2aeb8d15f148c90c536ebabb7460e9fed15738dd0c88c3c6825cf40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-all"

RDEPENDS:${PN} += "python39-PyYAML \
python39-aws-xray-sdk \
python39-cfn-lint \
python39-docker \
python39-graphql-core \
python39-idna \
python39-jsondiff \
python39-moto \
python39-openapi-spec-validator \
python39-pyparsing \
python39-python-jose \
python39-setuptools \
python39-sshpubkeys"

inherit rpm
