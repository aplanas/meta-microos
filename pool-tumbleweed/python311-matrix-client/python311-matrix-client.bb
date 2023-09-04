SUMMARY = "Client-Server SDK for Matrix"
DESCRIPTION = "Client-Server SDK for Matrix"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-matrix-client-0.4.0-1.1.noarch.rpm"
RPM_HASH = "03f755d7f5ec6703777b0f27bcc6b9ecf186f4e8aa0dfa19cc983edef887f673bff95a224653c600340296459ea655660f74078e00dce773946053a6713fcb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-client \
python3.11dist-matrix-client \
python311-matrix-client \
python3dist-matrix-client"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-urllib3"

inherit rpm
