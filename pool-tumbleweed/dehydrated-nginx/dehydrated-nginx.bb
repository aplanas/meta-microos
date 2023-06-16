SUMMARY = "Nginx Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to nginx."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-nginx-0.7.1-1.2.noarch.rpm"
RPM_HASH = "7512659df72e581a84f6cf23c4077d846f906a4b01b118f2581adfca61414f78b89a36eafae83878bbc6ea9176254be363b87869232965f33db21a0afc636547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-nginx \
dehydrated-nginx \
letsencrypt.sh-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
dehydrated \
nginx"

inherit rpm
