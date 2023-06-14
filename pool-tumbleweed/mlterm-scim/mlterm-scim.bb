SUMMARY = "SCIM plugin for mlterm"
DESCRIPTION = "A plugin to use the SCIM input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-scim-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "aef407ddf9775d555c6c2f51d83d7c43f945028f0da5f1539be2260a519b9cc666be9a7d12605957cc6d553ad82cf66bb7b1b5dd27257077857f054bb657cc79"

RPROVIDES:${PN} += "libim-scim.so \
locale-scim-ja;ko;ar;he \
mlterm-scim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpobl.so.2 \
libscim-1.0.so.8"

inherit rpm
