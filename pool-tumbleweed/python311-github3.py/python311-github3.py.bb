SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python311-github3.py-4.0.1-1.1.noarch.rpm"
RPM_HASH = "96665d2f551ed4d888e8794138c0264ba3e968280ee421e54f23ea0a45700ec9951fd0ed31ee9589a4c695efe2fa4fa1ef9a0ebdc37fb01566f9211a074ebf24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-github3.py \
python3.11dist-github3.py \
python311-github3.py \
python3dist-github3.py"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-jwcrypto \
python311-python-dateutil \
python311-requests \
python311-uritemplate"

inherit rpm
