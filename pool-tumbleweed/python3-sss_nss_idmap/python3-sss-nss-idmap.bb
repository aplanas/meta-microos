SUMMARY = "Python bindings for libsss_nss_idmap"
DESCRIPTION = "The libsss_nss_idmap-python contains the bindings so that \
libsss_nss_idmap can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "python3-sss_nss_idmap-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "931b713acf2ba2bd7003c88c42c7169aee46ac5f051dd674112ef4c0b0c7ec5ab201e0744ac6316ac7066d76f5090d6810c2bd3227cd3dc66c8eb9178f8a2f52"

RPROVIDES:${PN} += "python3-sss-nss-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-nss-idmap.so.0 \
python-abi \
python3"

inherit rpm
