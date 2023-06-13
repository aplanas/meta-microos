SUMMARY = "Python bindings for the libsignon-glib library"
DESCRIPTION = "This package contains the python bindings for the libsignon-glib \
management library."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "python3-libsignon-glib-2.1-1.17.aarch64.rpm"
RPM_HASH = "3efc423cc0859c4ef5205dc925672efcc3d3740e059dcdb9b15f8a78e5018aeaf201576335b491d88102435a708146fbdf9ea4e16db40116630896de6f5f9c20"

RPROVIDES:${PN} += "python3-libsignon-glib \
python3-libsignon-glib(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
typelib(GObject)"

inherit rpm
