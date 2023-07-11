SUMMARY = "Reed-Solomon decoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon decoder for Compact Discs with \
a mechanism for Error Detection and Correction (EDC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc_dec1_0-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "2fcf9e97780c7586c2706fb1b526a49e31227ed2d414b69d9d11ff89a77d323d6c6d7336073d498b73d28d5dcbcbd8011eaddf876432e970e9b330c12efb1460"

RPROVIDES:${PN} += "libedc-ecc-dec.so.1.0 \
libedc-ecc-dec1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedc-ecc.so.1.0"

inherit rpm
