SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python39-django-oauth-toolkit-1.7.0-1.8.noarch.rpm"
RPM_HASH = "38323664a9ffae3e8fa055f60e44e0ac9088568cf9a9b742786a6eea38b2e8b865f6449f4e437dff7f2742753d58e6d8a845b7a1c63b0dfb39f5906421836f6f"
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
