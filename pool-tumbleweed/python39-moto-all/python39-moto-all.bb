SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-all-4.1.0-1.7.noarch.rpm"
RPM_HASH = "49fad5d89986469d5e624c6ae5c863a8193096b04b3e5c9d26efdb5f4d48a355de47437039ec3eabb11ce4f2694d4d36a37caf0092d12132647a101e7495b0c5"
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
