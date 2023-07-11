SUMMARY = "FastCGI wrapper for CGI scripts"
DESCRIPTION = "fcgiwrap is a server for running CGI applications over FastCGI. \
It provides CGI support to Nginx (and other web servers \
that may need it). Apache and lighthttpd don't need it, as they spawn \
FastCGI workers on demand."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-1.1.0+18+g99c942c-3.13.aarch64.rpm"
RPM_HASH = "512d710399ff459a5153c422b5fd8e64457a840bb6c2f3d3b18cf1fbbc5e7a87b219e029995e4f645dbe89ce23ba53e01621e882c9ddbf1c3e5f42c9e32209b9"

RPROVIDES:${PN} += "fcgiwrap"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6 \
libfcgi.so.0 \
libsystemd.so.0 \
systemd"

inherit rpm
