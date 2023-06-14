SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "ortp-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "02cf3691842a3cf9099769d83c3c5dd4070e86896b1a25bbc6dc36a1878846448eca030ee1b13d96f737780479968d135bb6c9aab46ab8e0a04498f5f75cf879"

RPROVIDES:${PN} += "ortp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libc.so.6"

inherit rpm
