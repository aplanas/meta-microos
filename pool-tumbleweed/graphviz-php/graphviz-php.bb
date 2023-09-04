SUMMARY = "PHP Extension for Graphviz"
DESCRIPTION = "The graphviz-php package contains the PHP extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-php-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "dee53b492be163b4fa1920d2efa690904af4ede546756f9d1a65ae8d5f358d2525fd335dd912edf8f5dd49e3c247613d1cd432a68ea0b0bb1cdb6714ba092f32"

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
