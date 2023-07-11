SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python310-django-oauth-toolkit-1.7.0-1.8.noarch.rpm"
RPM_HASH = "f8e322cd23b778c2b78f70329cb11d46b1f02561f2143ba41f2f9b188de000c63f2e08c4d38086257ff9dda4a09fd8621fffd99eb424df7eeec4e965ba8125b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-oauth-toolkit \
python310-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-jwcrypto \
python310-oauthlib \
python310-requests"

inherit rpm
