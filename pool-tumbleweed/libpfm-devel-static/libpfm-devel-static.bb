SUMMARY = "Static library version of libpfm"
DESCRIPTION = "This package contains the static variant of libpfm."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-static-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "95b647e7b6061376b151b4593960eb09b30701919ad235685ccb94bb65b26e534b536c832177cf260ccc7f691fbc3470c4c68a00366dc24c1a00c0fa9507092b"

RPROVIDES:${PN} += "libpfm-devel-static"

RDEPENDS:${PN} += "libpfm-devel"

inherit rpm
