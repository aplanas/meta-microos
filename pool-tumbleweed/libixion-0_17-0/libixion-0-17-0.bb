SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-0_17-0-0.17.0-3.5.aarch64.rpm"
RPM_HASH = "f7b4b4295499bb41a12b925ec51ccf0f0ed1d4ca6f868ac01ab3230f9efb2ac8a78c25fd96cdd037cb695a8fad52597874ac58f4983259287637400650a2ccb2"

RPROVIDES:${PN} += "libixion-0-17-0 \
libixion-0.17.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
