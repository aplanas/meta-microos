SUMMARY = "PHP Extension Module"
DESCRIPTION = "Phalcon is a framework for PHP7 written as a C extension. \
Zephir is a high-level language, something between C and PHP. It is \
both dynamic and static typed and it supports the features we need to \
create and maintain a project like Phalcon."
LICENSE = "BSD-3-Clause"

PV = "5.2.1"

RPM_NAME = "php8-phalcon-5.2.1-1.3.aarch64.rpm"
RPM_HASH = "088f0f7d59afe89162c7c9a4686b0d77c38afb617d7ad570c1642a41ded1249a7cc66fb2cbe34a850af232bcfb4d473c134f34eab71063fa53c0327d5a5c5002"

RPROVIDES:${PN} += "config(php8-phalcon) \
php8-phalcon \
php8-phalcon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php8-mysql"

inherit rpm
