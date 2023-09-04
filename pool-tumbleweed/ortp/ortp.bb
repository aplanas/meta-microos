SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "ortp-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "11c880bb0d65f39536f48678b610e07bbe6d457161d2982136004b48c0af1b9d89157ab1aabc40630845ddebee0d892f8753eebcccaca73eb62452e165bd959f"

RPROVIDES:${PN} += "ortp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libc.so.6"

inherit rpm
