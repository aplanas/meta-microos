SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "ortp-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "9fbad14d03ef3e07f0c44986a9271016caf2fe399807a49bc6b2b1bc0bb638413550dbac2fe79b68a69ac97f722797201cddb775acbd319fb042594f078cf4fe"

RPROVIDES:${PN} += "ortp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libc.so.6"

inherit rpm
