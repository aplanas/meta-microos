SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libortp15-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "591184da4b863d788e67666626470c6fabe912ea51bd72c43816a5c97cba89c04bb0de4718e07b7686f98ee72745057b68f45c4877df4f86a951504193ab23c5"

RPROVIDES:${PN} += "libortp.so.15 \
libortp15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
