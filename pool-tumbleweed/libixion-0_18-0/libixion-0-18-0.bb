SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "libixion-0_18-0-0.18.1-1.1.aarch64.rpm"
RPM_HASH = "e3e066ea1132f2fc83d77e8d16c4de0f868a281640fab0d536dfe24d3571b7f4bb36fa78a8f1379e81251a9215d059fad0106c16acd0bc9a6996f3b68f6905d3"

RPROVIDES:${PN} += "libixion-0-18-0 \
libixion-0.18.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
