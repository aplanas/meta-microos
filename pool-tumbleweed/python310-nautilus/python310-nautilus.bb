SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python310-nautilus-4.0-1.5.aarch64.rpm"
RPM_HASH = "3a227d518faf7d51636db3e23daf1034c4c3c16ed02a2065f03bc9796eef78e119bf3fcb3f9beb5bb95c8140187b506dd54a296256d62782726dec626e9c71de"

RPROVIDES:${PN} += "python3-nautilus \
python310-nautilus \
python310-nautilus(aarch-64)"

RDEPENDS:${PN} += "python310-gobject \
python310-nautilus-common-files \
typelib(Nautilus)"

inherit rpm
