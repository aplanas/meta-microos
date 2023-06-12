SUMMARY = "FastCGI wrapper for CGI scripts"
DESCRIPTION = "fcgiwrap is a server for running CGI applications over FastCGI. \
It provides CGI support to Nginx (and other web servers \
that may need it). Apache and lighthttpd don't need it, as they spawn \
FastCGI workers on demand."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-1.1.0+18+g99c942c-3.12.aarch64.rpm"
RPM_HASH = "07ed1a7bb80471d553d963102831e2939bbb24d87a1233d5a3a89f120215e08fe7b06c1957c248d1c509763499bc2fab57f04f6e70da19f15171471aae573824"

RPROVIDES:${PN} += "fcgiwrap \
fcgiwrap(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6(GLIBC_2.34)(64bit) \
libfcgi.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
systemd"

inherit rpm
