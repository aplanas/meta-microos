SUMMARY = "A WSGI interface for Python3 web applications in Apache"
DESCRIPTION = "The mod_wsgi adapter is an Apacheache module that provides a WSGI compliant \
interface for hosting Python based web applications within Apache. The \
adapter is written completely in C code against the Apache C runtime and \
for hosting WSGI applications within Apache has a lower overhead than using \
existing WSGI adapters for mod_python or CGI."
LICENSE = "Apache-2.0"

PV = "4.9.4"

RPM_NAME = "apache2-mod_wsgi-4.9.4-1.5.aarch64.rpm"
RPM_HASH = "cda95dcf503c480b184acd9b52c9fe04bed99b410f3a67de43aa1319df3f65486cc094160eef41e47aa131e93921a7f86e0bf542a00eb61a75fb475351794af8"

RPROVIDES:${PN} += "apache2-mod-wsgi \
apache2-mod-wsgi-python3 \
mod-wsgi \
python3.11dist-mod-wsgi \
python3dist-mod-wsgi"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
suse-maintenance-mmn-0"

inherit rpm
