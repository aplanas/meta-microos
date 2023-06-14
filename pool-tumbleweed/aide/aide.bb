SUMMARY = "Advanced Intrusion Detection Environment"
DESCRIPTION = "AIDE is an intrusion detection system that checks file integrity."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.1"

RPM_NAME = "aide-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "1ce10e9af15e0ac4bcadeeecb12e3ac239c6292f1187828f93d5595e7697f24f457d7b641e497cc8a4dac36329f430c14330562ed5273d2a8f1eec6746a39819"

RPROVIDES:${PN} += "aide \
config-aide"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libm.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libz.so.1"

inherit rpm
