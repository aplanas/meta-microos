SUMMARY = "Ofono support for calls"
DESCRIPTION = "Ofono support for calls. \
 \
This package is not recommended, only install if you are sure you \
want ofono support."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.2"

RPM_NAME = "calls-ofono-44.2-1.1.aarch64.rpm"
RPM_HASH = "bed578c06040805b0c3951b0e3c220a08050f66a02965db020b6e3257c813e5f8a8438bfa581aeff2684fe97ae1905520377e19c9a98497ff8a2c3e7cf5ea528"

RPROVIDES:${PN} += "calls-ofono \
libofono.so"

RDEPENDS:${PN} += "calls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
