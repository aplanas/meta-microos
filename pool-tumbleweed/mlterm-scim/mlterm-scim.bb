SUMMARY = "SCIM plugin for mlterm"
DESCRIPTION = "A plugin to use the SCIM input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-scim-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "4e2957246396bc4bec69fdbda3010fdb548f712dc90a2c43aa10618701b14e0a117b9fd1bdd42342ca67e1dc58eda212ce4cb7a52c643a008b9df32f473817fa"

RPROVIDES:${PN} += "libim-scim.so \
locale-scim-ja;ko;ar;he \
mlterm-scim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpobl.so.2 \
libscim-1.0.so.8"

inherit rpm
