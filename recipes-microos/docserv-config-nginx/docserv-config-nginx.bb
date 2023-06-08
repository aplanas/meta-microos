SUMMARY = "Configuration files for nginx to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for nginx to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-nginx-20230308.4ed55cf-1.3.noarch.rpm"
RPM_HASH = "41ae91c63f0c0c34786cc5df3323ce115e199abaae09c448f966ee76eee0c26f5c2fbbb342215fee23eea52ef35e17e1dcb1eeead56108ca5e40dd7be380f66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-nginx"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
