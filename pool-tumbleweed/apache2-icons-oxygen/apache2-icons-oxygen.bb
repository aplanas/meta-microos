SUMMARY = "Oxygen icons for Apache 2"
DESCRIPTION = "KDE/Oxygen icons for Apache 2."
LICENSE = "LGPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "apache2-icons-oxygen-1.0.1-2.8.noarch.rpm"
RPM_HASH = "855d54ac22eb69b6c77f2e00ec971bff9726c0680d8821c19210041f71f2af96cd9f628d6efe1a34d48251455d9d743296af55b522abb7144bf4f4e6d636cde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-icons-oxygen \
config-apache2-icons-oxygen"

RDEPENDS:${PN} += "apache2"

inherit rpm
