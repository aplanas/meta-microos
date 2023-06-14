SUMMARY = "PHP Extension for Graphviz"
DESCRIPTION = "The graphviz-php package contains the PHP extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-php-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "90d9b1ff1e7d329e41ea323615ea6d0bdd95efffaa9a108e2a68dbab33b1089e5670c45b4895f5f15f4d66631888e438466a53c193883e294a9fb4694164ec42"

RPROVIDES:${PN} += "config-graphviz-php \
graphviz-php \
libgv-php.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libstdc++.so.6 \
php-api \
php-zend-abi \
php8"

inherit rpm
