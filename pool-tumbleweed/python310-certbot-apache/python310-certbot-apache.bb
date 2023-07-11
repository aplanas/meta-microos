SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-apache-2.6.0-1.3.noarch.rpm"
RPM_HASH = "1bdcd552880e5a0464a0fdc71e408840a0e99360a1af0b6ed2635aad13e534aab7d6088ed5b6a5822e2798f90489c19c6419d2f027d538c94e88c78d8457f0da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-apache \
python310-certbot-apache \
python3dist-certbot-apache"

RDEPENDS:${PN} += "apache2 \
python-abi \
python310-acme \
python310-augeas \
python310-certbot"

inherit rpm
