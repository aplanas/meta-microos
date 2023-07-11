SUMMARY = "PHP Extension for Graphviz"
DESCRIPTION = "The graphviz-php package contains the PHP extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-php-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "f174e858d38ed6492367f3a023a3724ebdc493db1ce621a2ee4c1fa6b9bd6d1c4803d0c4ceeb1df4299f03979ee7507d957aa10366ecd2fb0d1e9c226a36bb03"

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
