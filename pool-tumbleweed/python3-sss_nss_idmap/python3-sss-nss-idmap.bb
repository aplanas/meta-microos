SUMMARY = "Python bindings for libsss_nss_idmap"
DESCRIPTION = "The libsss_nss_idmap-python contains the bindings so that \
libsss_nss_idmap can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python3-sss_nss_idmap-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "cf8aca74a65aee317bfb0017853fd0ea0a6757787ec9873cf3c4c4f52f3c028b6cfa7b9e58ca03502bd40ac246ca0b98131698b1fd08b28b41579692b109a6d5"

RPROVIDES:${PN} += "python3-sss-nss-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-nss-idmap.so.0 \
python-abi \
python3"

inherit rpm
