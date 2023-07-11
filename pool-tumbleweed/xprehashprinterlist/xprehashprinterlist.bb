SUMMARY = "Utility to recompute list of available printers"
DESCRIPTION = "xprehashprinterlist causes all Xprint servers to recompute (update) \
their lists of available printers, and update the attributes for the \
printers. The intended usage of this tool is that a system \
administrator can run it after changing the printer topology."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xprehashprinterlist-1.0.1-9.27.aarch64.rpm"
RPM_HASH = "f210ff6a85e85bcdb857c1d435e7aaf3ef4264ff741700320c6b896f3c2c5ea066ac0cca0a4842fa9cf433080a0542de8150929e436bd0d370c8f9dbc39f6668"

RPROVIDES:${PN} += "xprehashprinterlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXp.so.6 \
libc.so.6"

inherit rpm
