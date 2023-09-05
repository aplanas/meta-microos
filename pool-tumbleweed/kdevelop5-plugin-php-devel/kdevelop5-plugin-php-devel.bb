SUMMARY = "Development package for kdevelop5-plugin-php"
DESCRIPTION = "This package contains the development files needed in order to use the \
kdevelop5-plugin-php API."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevelop5-plugin-php-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "91d59364263588894fdb2fe1b4e8010c31636587741aadb53479bfddb164683b3f3ae869a4f2b9705be8cfc51002bc6e0243422cf3a60e6abf288cdefb96b245"

RPROVIDES:${PN} += "cmake-KDevPHP \
kdevelop5-plugin-php-devel"

RDEPENDS:${PN} += "kdevelop5-plugin-php"

inherit rpm
