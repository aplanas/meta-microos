SUMMARY = "Minuet: Build Environment"
DESCRIPTION = "Development headers and libraries for Minuet."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "minuet-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "df643404dd9d7db8abce2b1f46d6d59dd46c4ac2ee2a2b866bcd605f1903af1efa11f483e250af2567f63377be5ebd5e1d650da1e9feda333e0a5208abe3e089"

RPROVIDES:${PN} += "minuet-devel"

RDEPENDS:${PN} += "minuet"

inherit rpm
