SUMMARY = "A WSGI interface for Python3 web applications in Apache"
DESCRIPTION = "The mod_wsgi adapter is an Apacheache module that provides a WSGI compliant \
interface for hosting Python based web applications within Apache. The \
adapter is written completely in C code against the Apache C runtime and \
for hosting WSGI applications within Apache has a lower overhead than using \
existing WSGI adapters for mod_python or CGI."
LICENSE = "Apache-2.0"

PV = "4.9.4"

RPM_NAME = "apache2-mod_wsgi-4.9.4-1.3.aarch64.rpm"
RPM_HASH = "9178533738631aa16c7a1e395175055724455f70a3aef6b4d17e6f53490c5da10d251165818c64696185e0ac19bef05ea298a67502838ad5ccbbd02ee70c5ada"

RPROVIDES:${PN} += "apache2-mod-wsgi \
apache2-mod-wsgi-python3 \
mod-wsgi \
python3.10dist-mod-wsgi \
python3dist-mod-wsgi"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
suse-maintenance-mmn-0"

inherit rpm
