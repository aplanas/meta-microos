SUMMARY = "PHP Extension Module"
DESCRIPTION = "Phalcon is a framework for PHP7 written as a C extension. \
Zephir is a high-level language, something between C and PHP. It is \
both dynamic and static typed and it supports the features we need to \
create and maintain a project like Phalcon."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "php8-phalcon-5.3.0-1.1.aarch64.rpm"
RPM_HASH = "1cffbc6e0063ea789378127b4699ad47e035737c4a9ef2520ecbadd9bc07b3a133db9a6156d571114ff1f916510fa1a1a05d1c90ab393c2afe5cdefddebe4f9f"

RPROVIDES:${PN} += "config-php8-phalcon \
php8-phalcon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php8-mysql"

inherit rpm
