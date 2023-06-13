SUMMARY = "Bleeding edge Icinga Web 2 libraries"
DESCRIPTION = "Icinga Web 2 - ReactPHP-based 3rd party libraries"
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "icingaweb2-module-incubator-0.19.0-1.2.noarch.rpm"
RPM_HASH = "a715142ff84839324097fedf837210dec641b8243da2e1d4c413a42f07ae252b9ab41deed76a9aa2b3f0db06c59eb2890f3e51ec5a6a66c5d7ef4cfef667a14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-incubator"

RDEPENDS:${PN} += "icingaweb2-module-ipl \
icingaweb2-module-reactbundle \
php \
php-ctype"

inherit rpm
