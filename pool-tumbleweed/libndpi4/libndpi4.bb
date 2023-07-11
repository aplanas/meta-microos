SUMMARY = "Extensible deep packet inspection library"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. nDPI was modified to \
be more suitable for traffic monitoring applications, by disabling \
specific features that slow down the DPI engine while being them \
un-necessary for network traffic monitoring."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "libndpi4-4.0-1.9.aarch64.rpm"
RPM_HASH = "aa743c6ac03cc908a7a87c606f07fab71c4f21994c8019f12eb7298d4e063c2fa9d2184d0f895e23ea69c0aa93e1b5f9b58e562c1687233506419bd1298dfe85"

RPROVIDES:${PN} += "libndpi.so.4 \
libndpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
ndpi-common"

inherit rpm
