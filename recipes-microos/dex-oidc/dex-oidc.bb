SUMMARY = "OpenID Connect Identity (OIDC) and OAuth 2.0 Provider with Pluggable Connectors"
DESCRIPTION = "Dex is an identity service that uses OpenID Connect to drive authentication for other apps. \
 \
Dex is NOT a user-management system, but acts as a portal to other identity providers through 'connectors.' \
This lets dex defer authentication to LDAP servers, SAML providers, or established identity providers like \
GitHub, Google, and Active Directory. Clients write their authentication logic once to talk to dex, then \
dex handles the protocols for a given backend."
LICENSE = "Apache-2.0"

PV = "2.35.3"

RPM_NAME = "dex-oidc-2.35.3-1.3.aarch64.rpm"
RPM_HASH = "7905a354947188ded117c93c615eb6dee07b8841d178a5dc42164312b1ec4e0273e8860ca92005cb0a7a97a6ead6e715904ac295ac2d621b9eba4eec4effac42"

RPROVIDES:${PN} += "caasp-dex dex-oidc dex-oidc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mkdir /usr/bin/touch fillup"

inherit rpm
