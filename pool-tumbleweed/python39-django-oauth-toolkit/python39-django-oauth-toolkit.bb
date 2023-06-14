SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python39-django-oauth-toolkit-1.7.0-1.6.noarch.rpm"
RPM_HASH = "d6140ec760e9d92d72590c9df95cf9e5c93b3bc49e37a2e046aef5aea97abcc9b116f3915c7f03b935239f1bc8378ad01fc0492b69c87bc68521decd5e67ad18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-oauth-toolkit \
python39-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-jwcrypto \
python39-oauthlib \
python39-requests"

inherit rpm
