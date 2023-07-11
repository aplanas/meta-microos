SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python39-nautilus-4.0-2.1.aarch64.rpm"
RPM_HASH = "491eb844050dda8da01550dfec6308bcf98b561d93ff5370ec7882aba12ccb79a71052d97f732212539af0e312ffb928d72b88b965cc94c4abad5b104078e909"

RPROVIDES:${PN} += "python39-nautilus"

RDEPENDS:${PN} += "python39-gobject \
python39-nautilus-common-files \
typelib-Nautilus"

inherit rpm
