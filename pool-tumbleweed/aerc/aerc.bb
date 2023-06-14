SUMMARY = "An email client for terminals"
DESCRIPTION = "aerc is an email client that runs in terminals."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "aerc-0.15.2-2.1.aarch64.rpm"
RPM_HASH = "021d0d4e53c2e1936ffb00e4645d38e4c44292c53dd14fe542ed5270b79c6b88251f040a4e504995e716b7a4f5150859766d23c819c2767e6c222bec18d83490"

RPROVIDES:${PN} += "aerc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/awk \
/usr/bin/python3 \
libc.so.6 \
libnotmuch.so.5"

inherit rpm
