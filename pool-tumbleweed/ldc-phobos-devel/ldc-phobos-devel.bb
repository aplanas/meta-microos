SUMMARY = "Development files for the D standard library"
DESCRIPTION = "This package contains the Phobos development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-phobos-devel-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "99f803577d5e33e8cb787399c798661afba0e7b0df4053246651d55fc3b98ed73cbf4a4c66dca65bbcc1dbe1541f0ccb561f46838c5f22ad2bacdd080d7d1d50"

RPROVIDES:${PN} += "ldc-phobos-devel"

RDEPENDS:${PN} += "ldc-runtime-devel \
libphobos2-ldc102"

inherit rpm
