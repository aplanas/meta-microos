SUMMARY = "SCIM plugin for mlterm"
DESCRIPTION = "A plugin to use the SCIM input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-scim-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "9a6d2f517659cacfd01276d7d792d2caacf2fdb16aefda2290988b438c3d86d65df86a6121898bdefb1e344821cfd1b9dc61e33c5c4c7d5fe7b195c0ca0aa3ba"

RPROVIDES:${PN} += "libim-scim.so \
locale-scim-ja;ko;ar;he \
mlterm-scim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpobl.so.2 \
libscim-1.0.so.8"

inherit rpm
