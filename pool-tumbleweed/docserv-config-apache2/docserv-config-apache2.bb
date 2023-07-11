SUMMARY = "Configuration files for Apache 2.4 to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for Apache 2.4 to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-apache2-20230308.4ed55cf-1.5.noarch.rpm"
RPM_HASH = "c8c3f6bab1ff0324c51f1a1f6dfb131bb2b17861321840cb6bcef8ae1d1ebdeb3dc13f62214e937947fd35d0b07f6720980fcadc7b562733ff0f7191aeabfb67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-apache2"

RDEPENDS:${PN} += ""

inherit rpm
