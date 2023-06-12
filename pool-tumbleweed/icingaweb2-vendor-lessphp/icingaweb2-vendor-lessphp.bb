SUMMARY = "Icinga Web 2 vendor library lessphp"
DESCRIPTION = "Icinga Web 2 vendor library lessphp."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-lessphp-2.11.4-2.1.noarch.rpm"
RPM_HASH = "e09e1b26ee630d8e304c79af78d6d5b6d134ebe727bd3e2a188b4aa80c41af69115b4cdaefbc64c5cbe504726c7974644c2c2fb2f53ba77294b0b8e3155032c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-lessphp"
RDEPENDS:${PN} += "/usr/bin/php \
icingaweb2-common \
php"

inherit rpm
