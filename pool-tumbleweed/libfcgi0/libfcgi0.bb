SUMMARY = "A scalable, open extension to CGI - System library"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "libfcgi0-2.4.0-173.2.aarch64.rpm"
RPM_HASH = "55aa65d60935f6535e380d1f5030eb674ac40e7da80273d7bff69ba92bf875f5e1e1eee325fc5ade88e1b54180f1e03493ae5dac9f29ba521690da550291cfec"

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
