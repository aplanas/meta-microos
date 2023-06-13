SUMMARY = "Shepherd's init binaries"
DESCRIPTION = "Binaries of shepherd conflicting with other init systems."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "shepherd-bins-0.8.1-1.9.aarch64.rpm"
RPM_HASH = "75dc6e0cdc216d9c30116fff1e6e3fa60ff6f9b23eec8d7c8dab96b4d232455eb299214336fc74908b596a4f103e50459caeb39adf97145108641e25761568c9"

RPROVIDES:${PN} += "/sbin/shutdown \
shepherd-bins \
shepherd-bins(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/guile"

inherit rpm
