SUMMARY = "An email client for terminals"
DESCRIPTION = "aerc is an email client that runs in terminals."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "aerc-0.15.2-3.1.aarch64.rpm"
RPM_HASH = "15a7e425d929ce23462dcb58e31a3537d2dce5c2a67baa3756154ff2129c57ab5b228046a1f23f8eb518b0b0f404c6c0c218de4e22aebe411d7d93212f079807"

RPROVIDES:${PN} += "aerc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
libnotmuch.so.5"

inherit rpm
