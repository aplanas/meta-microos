SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "The 32bit pattern complementing minimal_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "41dcec5c67154b7dff9e5dfaeb3aadd2608ef381b4937fd0d64487d1c3bfab20c3d5ceefb9dd97e378eb4c76c5c89c62ed9a5401e935b2b91a72f9e814e64b3e"

RPROVIDES:${PN} += "pattern- \
patterns-base-minimal-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
