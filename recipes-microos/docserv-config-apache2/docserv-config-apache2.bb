SUMMARY = "Configuration files for Apache 2.4 to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for Apache 2.4 to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-apache2-20230308.4ed55cf-1.3.noarch.rpm"
RPM_HASH = "6d2652a88629974aaf225388b6faf6ce52becca96fce856d4337dccf001ddd90b2a43f456eb7e8ba377f75d583de7e138f83758e1077de2d62541a805f014d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-apache2"
RDEPENDS:${PN} += ""

inherit rpm
