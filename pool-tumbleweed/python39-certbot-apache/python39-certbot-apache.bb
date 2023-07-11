SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-apache-2.6.0-1.3.noarch.rpm"
RPM_HASH = "25df7ac97eeea6c22066d9cd6b7b80f9729879405e218f75c1023a37fc8f3749b96a687a0ca2e4b72be80ef959919196dc387f7c1f157c6b3c479dd15636fff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-apache \
python39-certbot-apache \
python3dist-certbot-apache"

RDEPENDS:${PN} += "apache2 \
python-abi \
python39-acme \
python39-augeas \
python39-certbot"

inherit rpm
