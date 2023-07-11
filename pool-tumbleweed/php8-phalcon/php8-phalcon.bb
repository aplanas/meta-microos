SUMMARY = "PHP Extension Module"
DESCRIPTION = "Phalcon is a framework for PHP7 written as a C extension. \
Zephir is a high-level language, something between C and PHP. It is \
both dynamic and static typed and it supports the features we need to \
create and maintain a project like Phalcon."
LICENSE = "BSD-3-Clause"

PV = "5.2.2"

RPM_NAME = "php8-phalcon-5.2.2-1.1.aarch64.rpm"
RPM_HASH = "0eccf06f4e0f24924b2d6867babd96a935a3a1638f2ae0b934c15b16ae730950054195f0c294d63a828c9a89411bce1117f389099570ed785a8aad115df98ca5"

RPROVIDES:${PN} += "config-php8-phalcon \
php8-phalcon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php8-mysql"

inherit rpm
