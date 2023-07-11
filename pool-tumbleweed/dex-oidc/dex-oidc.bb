SUMMARY = "OpenID Connect Identity (OIDC) and OAuth 2.0 Provider with Pluggable Connectors"
DESCRIPTION = "Dex is an identity service that uses OpenID Connect to drive authentication for other apps. \
 \
Dex is NOT a user-management system, but acts as a portal to other identity providers through 'connectors.' \
This lets dex defer authentication to LDAP servers, SAML providers, or established identity providers like \
GitHub, Google, and Active Directory. Clients write their authentication logic once to talk to dex, then \
dex handles the protocols for a given backend."
LICENSE = "Apache-2.0"

PV = "2.35.3"

RPM_NAME = "dex-oidc-2.35.3-1.5.aarch64.rpm"
RPM_HASH = "098caa1b992601859f3a344e08223b19c569873f6ee759aacf4434263f2c50b7324fae590c92bf7f0aad9461f24412cc843191c71f04ce316339b467f332f4e3"

RPROVIDES:${PN} += "caasp-dex \
dex-oidc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
