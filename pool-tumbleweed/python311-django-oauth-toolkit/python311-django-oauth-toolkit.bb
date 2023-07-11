SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python311-django-oauth-toolkit-1.7.0-1.8.noarch.rpm"
RPM_HASH = "415d75606efa92d5dfe358d02fd6aafa85843fb411aa955bb129670040c6b3c1bea18b738fbfb1f053f0accf8d2a12461bf5b25cc016225164c4996149e7fcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oauth-toolkit \
python3.11dist-django-oauth-toolkit \
python311-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-jwcrypto \
python311-oauthlib \
python311-requests"

inherit rpm
