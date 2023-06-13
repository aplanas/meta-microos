SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python311-nautilus-4.0-1.5.aarch64.rpm"
RPM_HASH = "72d54b05db307541486c2ea64e76054b87ecac5c7607dbcfe35f0780dd316b53a3374692463488aba1c2e845ccf383cf3d8a4bbe28a75abcc63600a23e1afe7c"

RPROVIDES:${PN} += "python311-nautilus \
python311-nautilus(aarch-64)"

RDEPENDS:${PN} += "python311-gobject \
python311-nautilus-common-files \
typelib(Nautilus)"

inherit rpm
