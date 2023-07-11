SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python311-nautilus-4.0-2.1.aarch64.rpm"
RPM_HASH = "a56057a4e07ab005c942cbbfe215cc6acdcc8be39ab843ee02a02e56f4eef92b6009417b922a9edc42b2a25c5d6ace65a672d544399417e6c77c6a5ee697d2c3"

RPROVIDES:${PN} += "python3-nautilus \
python311-nautilus"

RDEPENDS:${PN} += "python311-gobject \
python311-nautilus-common-files \
typelib-Nautilus"

inherit rpm
