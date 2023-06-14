SUMMARY = "ASN.1 parsing tools"
DESCRIPTION = "This package contains various utilities for parting ASN.1 data."
LICENSE = "GFDL-1.3-or-later & GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "libtasn1-tools-4.19.0-1.3.aarch64.rpm"
RPM_HASH = "cd89c8cce73d55c7906f2c3a24ce848df40c3b4173a2296785a2f47c9d74844990e1ba158d4f5c29c462ba6dae2046c3b62fd8d12ab78de603aa66a1ff4e9e9b"

RPROVIDES:${PN} += "libtasn1 \
libtasn1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtasn1.so.6"

inherit rpm
