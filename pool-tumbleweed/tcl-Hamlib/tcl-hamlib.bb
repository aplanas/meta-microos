SUMMARY = "Tcl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "tcl-Hamlib-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "05ef635a13e9522a20e40e5febbb383eb8f1fe12ea039f4512c087f74198ef0e542ae91776de8d4f9b71dc147a3c0be359f8b4883bfe978c96b3d298fbba71c2"

RPROVIDES:${PN} += "tcl-Hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libtcl8.6.so \
tcl"

inherit rpm
