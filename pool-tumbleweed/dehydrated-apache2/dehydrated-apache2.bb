SUMMARY = "Apache Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to Apache."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-apache2-0.7.1-1.3.noarch.rpm"
RPM_HASH = "cba1de641faacbbdee01f633b27c002416cce1e51482732e1ef9495f260b62e04dc632a0b48a1f39781cd464b040a7cb7a73a2e20f29e2e48fec205c3bc2e52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-apache2 \
dehydrated-apache2 \
letsencrypt.sh-apache2"

RDEPENDS:${PN} += "apache2 \
dehydrated"

inherit rpm
