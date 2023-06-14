SUMMARY = "Apache Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to Apache."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-apache2-0.7.1-1.2.noarch.rpm"
RPM_HASH = "ae3860ceab15bc171fdf216dfbaeffc05f8edbd1e057737f999911c1b294344f389e335ce2a2c7eaf41c095814e30e401a50b9604abd5009aecfc10b481df990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-apache2 \
dehydrated-apache2 \
letsencrypt.sh-apache2"

RDEPENDS:${PN} += "apache2 \
dehydrated"

inherit rpm
