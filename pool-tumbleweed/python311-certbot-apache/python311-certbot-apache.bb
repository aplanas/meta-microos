SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-apache-2.6.0-1.3.noarch.rpm"
RPM_HASH = "93a9ecedd4af8177ce4c09540b234f33cd06ea784381e6ff79e09dfe6874178430bae6dcc453a7f51f4ba93fcd4ceef0baa287224b3c576e4894468af93eb21b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-apache \
python3.11dist-certbot-apache \
python311-certbot-apache \
python3dist-certbot-apache"

RDEPENDS:${PN} += "apache2 \
python-abi \
python311-acme \
python311-augeas \
python311-certbot"

inherit rpm
