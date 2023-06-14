SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python311-django-oauth-toolkit-1.7.0-1.6.noarch.rpm"
RPM_HASH = "934b56cad3ad770ae505ea4764492262a8a72ba1c691ca21f6e3df0e3cea11824d892c0fe20db83806ad82087471001b73ca4b7575416f0dcec164e98d4221f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-oauth-toolkit \
python311-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-jwcrypto \
python311-oauthlib \
python311-requests"

inherit rpm
