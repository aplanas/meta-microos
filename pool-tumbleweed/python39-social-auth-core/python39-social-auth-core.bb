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

RPM_NAME = "python39-social-auth-core-4.4.2-1.1.noarch.rpm"
RPM_HASH = "abbc533cc820da19bb673db6dfbf908b6c7c72858296b599382812e90de487669fa3ff501939722a9565091c97f2fd3980bed03256b8baae6e7e92c104fb870a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(social-auth-core) \
python39-social-auth-core \
python3dist(social-auth-core)"

RDEPENDS:${PN} += "python(abi) \
python39-PyJWT \
python39-cryptography \
python39-defusedxml \
python39-oauthlib \
python39-python3-openid \
python39-requests \
python39-requests-oauthlib"

inherit rpm
