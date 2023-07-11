SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python310-nautilus-4.0-2.1.aarch64.rpm"
RPM_HASH = "4dcea678d58c591d27acc70805ff74cd10ad2abeec55add5e5b0cd92b258c480164b266277ee31eb877d2806d46b552edbeefb54310a50cdafe58e2ef6fcd25a"

RPROVIDES:${PN} += "python310-nautilus"

RDEPENDS:${PN} += "python310-gobject \
python310-nautilus-common-files \
typelib-Nautilus"

inherit rpm
