SUMMARY = "Development package for kdevelop5-plugin-php"
DESCRIPTION = "This package contains the development files needed in order to use the \
kdevelop5-plugin-php API."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdevelop5-plugin-php-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cb97a1550e04b1116c824418dfbe5b68a0de56be58083573dddeca1b0283f035968bcabd5993840764fe2852f2de438a225853eb7a06e592a02483741bfbb45d"

RPROVIDES:${PN} += "cmake-KDevPHP \
kdevelop5-plugin-php-devel"

RDEPENDS:${PN} += "kdevelop5-plugin-php"

inherit rpm
