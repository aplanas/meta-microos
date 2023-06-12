SUMMARY = "Optional rules for OWASP ModSecurity CRS"
DESCRIPTION = "Optional rules for HTTP Protocol Validation, Common Web Attacks Protection, Request Header Tagging, ..."
LICENSE = "Apache-2.0"

PV = "2.2.9"

RPM_NAME = "owasp-modsecurity-crs-optional_rules-2.2.9-3.8.noarch.rpm"
RPM_HASH = "a0379847723b782c11dd6593973ed21e1872706afcd56685bcd65482015542b12b77402fe04ddf04375b579034ea5a592295db67a8c9a3f5d93553f54abf1354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(owasp-modsecurity-crs-optional_rules) \
owasp-modsecurity-crs-optional_rules"
RDEPENDS:${PN} += "owasp-modsecurity-crs"

inherit rpm
