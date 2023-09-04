SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "libixion-devel-0.18.1-1.1.aarch64.rpm"
RPM_HASH = "254a9fada8285ec0519d963e2ace9177d5156bcd9e30b1c740d0ca275200cd1e3b8a1bb32d0d37f5aa4e0193382cf5985c8c6e3da13c9a20cd8f9b805a26feae"

RPROVIDES:${PN} += "libixion-devel \
pkgconfig-libixion-0.18"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixion-0-18-0"

inherit rpm
