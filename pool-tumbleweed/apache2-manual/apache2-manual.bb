SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-manual-2.4.57-1.1.noarch.rpm"
RPM_HASH = "eefc862ed6ed1ddf65429938cd6180d16915781f909d12153182e36d587a3f018b74304d65471b057feb5d542de3a5e49dd65c29b16ca469ba365748671d1f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-doc \
apache2-manual \
config(apache2-manual)"

RDEPENDS:${PN} += ""

inherit rpm
