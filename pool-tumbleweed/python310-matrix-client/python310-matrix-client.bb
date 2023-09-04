SUMMARY = "Client-Server SDK for Matrix"
DESCRIPTION = "Client-Server SDK for Matrix"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-matrix-client-0.4.0-1.1.noarch.rpm"
RPM_HASH = "845efe104edc909b61d961dd0a94aedf2dacb00edf501199a0ede43412f4d2d2775a2a6398a60fe7083bc2fe6a53084b0cda8db4724883710c25cd80cc5c733f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-matrix-client \
python310-matrix-client \
python3dist-matrix-client"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-urllib3"

inherit rpm
