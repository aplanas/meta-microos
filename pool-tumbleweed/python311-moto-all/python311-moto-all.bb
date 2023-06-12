SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-all-4.1.0-1.5.noarch.rpm"
RPM_HASH = "531aa696497cf6f397ae7f0f3694d7d829fbb90d7b774b93799aa1379ff738020b662444a01a17cfc1ff415d280fb7d81ce34d5ef99badd2bba73668f7a25ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-moto-all"
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
