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

RPM_NAME = "python311-social-auth-core-4.4.2-1.3.noarch.rpm"
RPM_HASH = "e3904558baeac2383c03349784b63bc588013dc3b757fbdc13b20b26e080d7dcb1f3c4a7e2f5874c385c2866b0b77b8c2b04407f8fb78f5741081a61ec4ee81d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-core \
python3.11dist-social-auth-core \
python311-social-auth-core \
python3dist-social-auth-core"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-cryptography \
python311-defusedxml \
python311-oauthlib \
python311-python3-openid \
python311-requests \
python311-requests-oauthlib"

inherit rpm
