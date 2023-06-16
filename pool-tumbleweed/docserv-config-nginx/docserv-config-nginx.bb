SUMMARY = "Configuration files for nginx to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for nginx to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-nginx-20230308.4ed55cf-1.4.noarch.rpm"
RPM_HASH = "df47fb2aa0b6ce9291ddc3115485c7b37589ed5e881ee73ad65687ddb8a0cc2fc27079ed01e469e5faf70793b18125ed3f97baf30cd9071766de007f49cf310c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-nginx"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
