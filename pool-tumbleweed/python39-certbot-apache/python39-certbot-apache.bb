SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-apache-1.31.0-1.3.noarch.rpm"
RPM_HASH = "706fb0543ea4f685ceb605cd0050a41ef8537bbd051be192449b15ddfc2e51847a6ed46597a14eebdc130016a69ab9acb71b572ee3fd7dbe9aff5c3a1ec17dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-apache) \
python39-certbot-apache \
python3dist(certbot-apache)"

RDEPENDS:${PN} += "apache2 \
augeas-lenses \
python(abi) \
python39-acme \
python39-augeas \
python39-certbot"

inherit rpm
