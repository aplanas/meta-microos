SUMMARY = "Configuration files for nginx to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for nginx to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-config-nginx-20230308.4ed55cf-1.5.noarch.rpm"
RPM_HASH = "bb176ce9fc1d205da5f0e8fe312a1ba716a99c6542c1fa33b9db0d826a154929cea933c9153d154cbc4f9d4fcf2a1f58c5b8fcee40b2341236a17fae7e4ecb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-nginx"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
