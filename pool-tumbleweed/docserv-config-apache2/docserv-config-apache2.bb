SUMMARY = "Configuration files for Apache 2.4 to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for Apache 2.4 to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-apache2-20230308.4ed55cf-1.4.noarch.rpm"
RPM_HASH = "b5d5b0904abe957e0e203b3a70afc9fb95a09ff2d3c727781cf255ff4e2f99854cb3103d41222c019c3dc72f1d77a39b6576b8a6e2517adedd823ae32474ccce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-apache2"
RDEPENDS:${PN} += ""

inherit rpm
