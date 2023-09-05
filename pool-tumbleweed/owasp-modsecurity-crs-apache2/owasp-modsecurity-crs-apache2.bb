SUMMARY = "OWASP ModSecurity Common Rule Set (CRS)"
DESCRIPTION = "The OWASP ModSecurity Core Rule Set (CRS) is a set of generic attack detection rules for use with ModSecurity \
or compatible web application firewalls. The CRS aims to protect web applications from a wide range of attacks, \
including the OWASP Top Ten, with a minimum of false alerts. \
 \
Includes Apache httpd 2.x rules"
LICENSE = "Apache-2.0"

PV = "3.3.5"

RPM_NAME = "owasp-modsecurity-crs-apache2-3.3.5-1.1.noarch.rpm"
RPM_HASH = "455dfe9fba72f9a09a2e1ffca84e7e7da59fba1d07f0afbae9982a0c4ac7686ed46caaeffc8be3d384e9e708c462b9d63449686c5037051bd6264f7659b7eaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-owasp-modsecurity-crs-apache2 \
owasp-modsecurity-crs-apache2"

RDEPENDS:${PN} += "apache2-mod-security2 \
owasp-modsecurity-crs"

inherit rpm
