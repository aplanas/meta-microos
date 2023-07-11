SUMMARY = "Nginx Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to nginx."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-nginx-0.7.1-1.3.noarch.rpm"
RPM_HASH = "095172b4435bcdc9b37e77909d1775f47751aa70fc2f0bb8523d106cc8127c2babad1dd5568d2a25d628896f53cad6e8cfdd8e0b92bdf0eec6c5b6cf36a4404a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-nginx \
dehydrated-nginx \
letsencrypt.sh-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
dehydrated \
nginx"

inherit rpm
