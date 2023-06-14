SUMMARY = "OpenID Connect Identity (OIDC) and OAuth 2.0 Provider with Pluggable Connectors"
DESCRIPTION = "Dex is an identity service that uses OpenID Connect to drive authentication for other apps. \
 \
Dex is NOT a user-management system, but acts as a portal to other identity providers through 'connectors.' \
This lets dex defer authentication to LDAP servers, SAML providers, or established identity providers like \
GitHub, Google, and Active Directory. Clients write their authentication logic once to talk to dex, then \
dex handles the protocols for a given backend."
LICENSE = "Apache-2.0"

PV = "2.35.3"

RPM_NAME = "dex-oidc-2.35.3-1.4.aarch64.rpm"
RPM_HASH = "4f15fe2311976d66a602824c30659b2706dcf8f3eb798e334cfec2ae347f9a4fefffbb4411563ef184772adad3c8e013782e9a86f08b418e173c9c7ba14b58ca"

RPROVIDES:${PN} += "caasp-dex \
dex-oidc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
