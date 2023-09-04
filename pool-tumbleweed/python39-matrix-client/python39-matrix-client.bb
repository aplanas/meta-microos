SUMMARY = "Client-Server SDK for Matrix"
DESCRIPTION = "Client-Server SDK for Matrix"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-matrix-client-0.4.0-1.1.noarch.rpm"
RPM_HASH = "b086ac31d187a382369ccdb9e9cb8325fd4b43afa748bb506f1376ab2082d1324c59a310f0875f78a83397e9cea97492bca29d0fb4fb7bad972c238ebf107e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-matrix-client \
python39-matrix-client \
python3dist-matrix-client"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-urllib3"

inherit rpm
