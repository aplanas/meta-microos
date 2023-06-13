SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-0_17-0-0.17.0-3.4.aarch64.rpm"
RPM_HASH = "241ef9e2e0690ad153115612d5e355edd38001d0865b447aabc4f9241b202d8498eae7e41b5a90c84bd421d7090f5135ceaf2cac0c679c155875327afb41b8b1"

RPROVIDES:${PN} += "libixion-0.17.so.0()(64bit) \
libixion-0_17-0 \
libixion-0_17-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
