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

RPM_NAME = "python310-social-auth-core-4.4.2-1.1.noarch.rpm"
RPM_HASH = "66a2c158480634a64730a19faacad223991b33ce077134893f201e7fc071b48ec43d49c7c2df8b45b1b52913db9b0cdb076ea8d424dceac7cf9061613571c8e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-core \
python3.10dist-social-auth-core \
python310-social-auth-core \
python3dist-social-auth-core"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-cryptography \
python310-defusedxml \
python310-oauthlib \
python310-python3-openid \
python310-requests \
python310-requests-oauthlib"

inherit rpm
