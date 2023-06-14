SUMMARY = "Reed-Solomon decoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon decoder for Compact Discs with \
a mechanism for Error Detection and Correction (EDC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc_dec1_0-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "42cb22c617561a1c466f815664fab95ba807628c1791d40bee93cba3d3a8b4a1c7396919aff3eea1103e72fdde84369e4a2cd23bb82bb2208d2ced57b2c5227b"

RPROVIDES:${PN} += "libedc-ecc-dec.so.1.0 \
libedc-ecc-dec1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedc-ecc.so.1.0"

inherit rpm
