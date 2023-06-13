SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-all-4.1.0-1.5.noarch.rpm"
RPM_HASH = "2b636dc055d546b73658d70cedc58715be6ae433d0f5dc1b128a16b083d757b835dfda21cbf54d4b357ad2a1929a0a51359d6cd8b99e207a222eaea7571aedd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-all \
python310-moto-all"

RDEPENDS:${PN} += "python310-PyYAML \
python310-aws-xray-sdk \
python310-cfn-lint \
python310-docker \
python310-graphql-core \
python310-idna \
python310-jsondiff \
python310-moto \
python310-openapi-spec-validator \
python310-pyparsing \
python310-python-jose \
python310-setuptools \
python310-sshpubkeys"

inherit rpm
