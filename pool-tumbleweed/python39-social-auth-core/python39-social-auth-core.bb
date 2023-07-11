SUMMARY = "Python Social Auth Core"
DESCRIPTION = "Python Social Auth is a social authentication/registration \
mechanism with support for several frameworks and auth providers. \
 \
This is the core component of the python-social-auth ecosystem. It \
implements the common interface to define new authentication backends to \
third party services, implement integrations with web frameworks and \
storage solutions."
LICENSE = "BSD-3-Clause"

PV = "4.4.2"

RPM_NAME = "python39-social-auth-core-4.4.2-1.3.noarch.rpm"
RPM_HASH = "e1646d15d7967bc465eb8dddf8886683418b02ee9dbe3d265b7854defc23cc0c69c88bbfdf34a0fc67caab3c4f16f3ff7b9734175c0263de953bf692d8c602fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-social-auth-core \
python39-social-auth-core \
python3dist-social-auth-core"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-cryptography \
python39-defusedxml \
python39-oauthlib \
python39-python3-openid \
python39-requests \
python39-requests-oauthlib"

inherit rpm
