SUMMARY = "Base rules for OWASP ModSecurity CRS"
DESCRIPTION = "Base rules for HTTP Protocol Validation, Common Web Attacks Protection, Trojan Protection, InfoLeakages, ..."
LICENSE = "Apache-2.0"

PV = "2.2.9"

RPM_NAME = "owasp-modsecurity-crs-base_rules-2.2.9-3.8.noarch.rpm"
RPM_HASH = "53f8a46a1e340af6bd0dc4cdf678a8735547ffa4b0dcdad3091ab60ae8935d754482e41c470b80e8fad7782327500ddc629550cee2a3a6cffe7846cc51ccdf3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(owasp-modsecurity-crs-base_rules) \
owasp-modsecurity-crs-base_rules"

RDEPENDS:${PN} += "owasp-modsecurity-crs"

inherit rpm
