SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-apache-1.31.0-1.3.noarch.rpm"
RPM_HASH = "81da5f6777f79d10af619f0179896ff2f7407417fcf895d8626951a744648452b704b548bbb27ddca79348592ef9decd2ae12958d749426caa7f5427b02cca7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-apache \
python3.10dist(certbot-apache) \
python310-certbot-apache \
python3dist(certbot-apache)"
RDEPENDS:${PN} += "apache2 \
augeas-lenses \
python(abi) \
python310-acme \
python310-augeas \
python310-certbot"

inherit rpm
