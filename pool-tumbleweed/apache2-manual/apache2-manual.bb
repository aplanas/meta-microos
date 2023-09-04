SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-manual-2.4.57-2.1.noarch.rpm"
RPM_HASH = "b91b8017fe16e0367280d8743ebee86580d4872ae43d726bdf22ec252f5184730addadc22d19347f5b0e51cb3a98f1e9a02647805bfef311baa9ec8a9d786e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-doc \
apache2-manual \
config-apache2-manual"

RDEPENDS:${PN} += ""

inherit rpm
