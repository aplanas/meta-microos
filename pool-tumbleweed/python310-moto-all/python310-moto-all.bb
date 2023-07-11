SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-all-4.1.0-1.7.noarch.rpm"
RPM_HASH = "75f3a4abe0472f9e39c93914c00bf94222f398b0ae291c07a646b9c179e5675442c08a8adad684a6a98016f5fa0e33379a3294dc3ac2be10ffc6c6963e5c10b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-moto-all"

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
