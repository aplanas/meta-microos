SUMMARY = "Metapackage, requires R-core-devel, R-core-libs"
DESCRIPTION = "Metapackage to keep the same user experience as before the split of \
the monolithic R-base-devel"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-base-devel-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "86843f26845bae882ad1d1e7f04921de638de4cd5e6c26e3feeafcfd5d8b847340d3d65868ffbb4260339181c1fcb349b09b2c9c37d2b33c0c597ae156a4b08b"

RPROVIDES:${PN} += "R-base-devel"

RDEPENDS:${PN} += "R-core-devel \
R-core-libs"

inherit rpm
