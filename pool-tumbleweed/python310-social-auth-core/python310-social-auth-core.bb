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

RPM_NAME = "python310-social-auth-core-4.4.2-1.3.noarch.rpm"
RPM_HASH = "2640dc6daaa1f60f40706692943aa81227df2fbdce8e58ecc5a2aa37e96267524c5af943e79b0bcb8c87a19dfb8bb42146f46afa330d908878196c1e13f4c8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-social-auth-core \
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
