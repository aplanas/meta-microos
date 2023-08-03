SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python310-moto-all-4.1.13-1.1.noarch.rpm"
RPM_HASH = "299a8031cf734961c5d68e5b7d8764dddd68665d53a72f5968ce2c357929ae06790c246a10e2cbf64a6990fc0c6b56ebab735ad19e447ab7f97228c46e6a9d7b"
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
