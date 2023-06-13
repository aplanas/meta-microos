SUMMARY = "Data files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-data-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "0a446a8d0b0e7ca8c4cf1d507d10f4013151e4a78f19bc7651c702d8ba61031952898bf737a73ed787243ecd90ffb7527208f3027e9e4110ea72496f96518924"

RPROVIDES:${PN} += "libcryptui-data \
libcryptui-data(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
