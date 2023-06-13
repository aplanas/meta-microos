SUMMARY = "Development package for kdevelop5-plugin-php"
DESCRIPTION = "This package contains the development files needed in order to use the \
kdevelop5-plugin-php API."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-plugin-php-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6f53063c02c76941d7c455ac15fdd302ce34bedb7eca4b384566de82dd6be4c8d11df1d9f339fb96405a6fe1e0f89318294ac06d0314b99104be69490ad1b6b0"

RPROVIDES:${PN} += "cmake(KDevPHP) \
kdevelop5-plugin-php-devel \
kdevelop5-plugin-php-devel(aarch-64)"

RDEPENDS:${PN} += "kdevelop5-plugin-php"

inherit rpm
