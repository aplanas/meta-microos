SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-bcmath-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "c6eac7304cc49bcf69f9013844a1341986d3f9c64c49edde72c4ae2f0f9fa0233e27c18aef001bd85c6d61945d54e8a75c7994f10d61cb6ee74f08411e2dd739"

RPROVIDES:${PN} += "config(php8-bcmath) \
php-bcmath \
php8-bcmath \
php8-bcmath(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
php"

inherit rpm
