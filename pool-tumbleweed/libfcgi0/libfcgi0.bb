SUMMARY = "A scalable, open extension to CGI - System library"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "libfcgi0-2.4.0-173.3.aarch64.rpm"
RPM_HASH = "04cc9c9bb7522532f2689fd4c5c09723c319784e82e245d386b50c33039f0e7a863f26445b655626844232a0d41d62f70103dff06cbd7b1d4ef47d55d87b69a6"

RPROVIDES:${PN} += "libfcgi++-0 \
libfcgi++.so.0 \
libfcgi.so.0 \
libfcgi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
