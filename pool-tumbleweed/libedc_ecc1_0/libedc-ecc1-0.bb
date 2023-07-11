SUMMARY = "Reed-Solomon encoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon encoder for Compact \
Discs to generate Error Correcting Codes (ECC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc1_0-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "90cd9e46b4e2ecd981b98a86eea9406a13080391b1f1033734e3dbc7d6af3b68c33ea3b56d6e430d73091d5bb8ba5e7199d96314f6ecfeb4a60d008ffb4dc6bf"

RPROVIDES:${PN} += "libedc-ecc.so.1.0 \
libedc-ecc1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
