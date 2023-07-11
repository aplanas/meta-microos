SUMMARY = "Icinga Web 2 vendor library lessphp"
DESCRIPTION = "Icinga Web 2 vendor library lessphp."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-lessphp-2.11.4-3.1.noarch.rpm"
RPM_HASH = "8dd9ab112df2eaec63c0c1bcd12f990901640ba0a2757594e419f2e1682c4b78d02001dd752f5bdfb2d9ce6f480134706c4146fdfb15a0d38065c60c013e7ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-lessphp"

RDEPENDS:${PN} += "/usr/bin/php \
icingaweb2-common \
php"

inherit rpm
